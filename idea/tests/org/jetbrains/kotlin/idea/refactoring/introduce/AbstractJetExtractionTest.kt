/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.refactoring.introduce

import com.intellij.ide.DataManager
import com.intellij.openapi.util.io.FileUtil
import com.intellij.psi.PsiComment
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiWhiteSpace
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.refactoring.BaseRefactoringProcessor.ConflictsInTestsException
import com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture
import com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase
import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.idea.JetLightCodeInsightFixtureTestCase
import org.jetbrains.kotlin.idea.PluginTestCaseBase
import org.jetbrains.kotlin.idea.caches.resolve.resolveToDescriptor
import org.jetbrains.kotlin.idea.refactoring.JetRefactoringUtil
import org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler
import org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.*
import org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor
import org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler
import org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler
import org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.renderer.DescriptorRenderer
import org.jetbrains.kotlin.test.ConfigLibraryUtil
import org.jetbrains.kotlin.test.InTextDirectivesUtils
import org.jetbrains.kotlin.test.JetTestUtils
import org.jetbrains.kotlin.test.util.findElementByComment
import org.jetbrains.kotlin.utils.emptyOrSingletonList
import java.io.File
import java.util.Collections
import kotlin.test.assertEquals

public abstract class AbstractJetExtractionTest() : JetLightCodeInsightFixtureTestCase() {
    override fun getProjectDescriptor() = LightCodeInsightFixtureTestCase.JAVA_LATEST

    val fixture: JavaCodeInsightTestFixture get() = myFixture

    protected fun doIntroduceVariableTest(path: String) {
        doTest(path) { file ->
            KotlinIntroduceVariableHandler().invoke(
                    fixture.getProject(),
                    fixture.getEditor(),
                    file,
                    DataManager.getInstance().getDataContext(fixture.getEditor().getComponent())
            )
        }
    }

    protected fun doIntroduceParameterTest(path: String) {
        doTest(path) { file ->
            val handler = object: KotlinIntroduceParameterHandler() {
                override fun configure(descriptor: IntroduceParameterDescriptor): IntroduceParameterDescriptor {
                    val fileText = file.getText()
                    val singleReplace = InTextDirectivesUtils.isDirectiveDefined(fileText, "// SINGLE_REPLACE")
                    val withDefaultValue = InTextDirectivesUtils.getPrefixedBoolean(fileText, "// WITH_DEFAULT_VALUE:") ?: true
                    return with (descriptor) {
                        copy(occurrencesToReplace = if (singleReplace) Collections.singletonList(originalOccurrence) else occurrencesToReplace,
                             withDefaultValue = withDefaultValue)
                    }
                }
            }
            with (handler) {
                val target = file.findElementByComment("// TARGET:") as? JetNamedDeclaration
                if (target != null) {
                    JetRefactoringUtil.selectExpression(fixture.getEditor(), file, true) { expression ->
                        invoke(fixture.getProject(), fixture.getEditor(), expression!!, target)
                    }
                }
                else {
                    invoke(fixture.getProject(), fixture.getEditor(), file, null)
                }
            }
        }
    }

    protected fun doIntroducePropertyTest(path: String) {
        doTest(path) { file ->
            val extractionTarget = propertyTargets.single {
                it.name == InTextDirectivesUtils.findStringWithPrefixes(file.getText(), "// EXTRACTION_TARGET: ")
            }
            val helper = object : ExtractionEngineHelper() {
                override fun configure(
                        descriptor: ExtractableCodeDescriptor,
                        generatorOptions: ExtractionGeneratorOptions
                ): ExtractionGeneratorConfiguration {
                    return ExtractionGeneratorConfiguration(
                            descriptor,
                            generatorOptions.copy(target = extractionTarget)
                    )
                }
            }
            KotlinIntroducePropertyHandler(helper).invoke(
                    fixture.getProject(),
                    fixture.getEditor(),
                    file,
                    DataManager.getInstance().getDataContext(fixture.getEditor().getComponent())
            )
        }
    }

    protected fun doExtractFunctionTest(path: String) {
        doTest(path) { file ->
            val explicitPreviousSibling = file.findElementByComment("// SIBLING:")
            val fileText = file.getText() ?: ""
            val expectedNames = InTextDirectivesUtils.findListWithPrefixes(fileText, "// SUGGESTED_NAMES: ")
            val expectedDescriptors =
                    InTextDirectivesUtils.findLinesWithPrefixesRemoved(fileText, "// PARAM_DESCRIPTOR: ").joinToString()
            val expectedTypes =
                    InTextDirectivesUtils.findLinesWithPrefixesRemoved(fileText, "// PARAM_TYPES: ").map { "[$it]" }.joinToString()

            val extractionOptions = InTextDirectivesUtils.findListWithPrefixes(fileText, "// OPTIONS: ").let {
                if (it.isNotEmpty()) {
                    [suppress("CAST_NEVER_SUCCEEDS")]
                    val args = it.map { it.toBoolean() }.copyToArray() as Array<Any?>
                    javaClass<ExtractionOptions>().getConstructors().first { it.getParameterTypes().size() == args.size() }.newInstance(*args) as ExtractionOptions
                } else ExtractionOptions.DEFAULT
            }

            val renderer = DescriptorRenderer.DEBUG_TEXT

            val editor = fixture.getEditor()
            val handler = ExtractKotlinFunctionHandler(
                    helper = object : ExtractionEngineHelper() {
                        override fun adjustExtractionData(data: ExtractionData): ExtractionData {
                            return data.copy(options = extractionOptions)
                        }

                        override fun configure(
                                descriptor: ExtractableCodeDescriptor,
                                generatorOptions: ExtractionGeneratorOptions
                        ): ExtractionGeneratorConfiguration {
                            val actualNames = descriptor.suggestedNames
                            val allParameters = emptyOrSingletonList(descriptor.receiverParameter) + descriptor.parameters
                            val actualDescriptors = allParameters.map { renderer.render(it.originalDescriptor) }.joinToString()
                            val actualTypes = allParameters.map {
                                it.getParameterTypeCandidates(false).map { renderer.renderType(it) }.joinToString(", ", "[", "]")
                            }.joinToString()

                            if (actualNames.size() != 1 || expectedNames.isNotEmpty()) {
                                assertEquals(expectedNames, actualNames, "Expected names mismatch.")
                            }
                            assertEquals(expectedDescriptors, actualDescriptors, "Expected descriptors mismatch.")
                            assertEquals(expectedTypes, actualTypes, "Expected types mismatch.")

                            val newDescriptor = if (descriptor.name == "") {
                                descriptor.copy(suggestedNames = Collections.singletonList("__dummyTestFun__"))
                            }
                            else {
                                descriptor
                            }
                            return ExtractionGeneratorConfiguration(newDescriptor, generatorOptions)
                        }
                    }
            )
            handler.selectElements(editor, file) { elements, previousSibling ->
                handler.doInvoke(editor, file, elements, explicitPreviousSibling ?: previousSibling)
            }
        }
    }

    protected fun doTest(path: String, action: (JetFile) -> Unit) {
        val mainFile = File(path)
        val afterFile = File("$path.after")
        val conflictFile = File("$path.conflicts")

        fixture.setTestDataPath("${JetTestUtils.getHomeDirectory()}/${mainFile.getParent()}")

        val mainFileName = mainFile.getName()
        val mainFileBaseName = FileUtil.getNameWithoutExtension(mainFileName)
        mainFile.getParentFile()
                .listFiles { file, name ->
                    name != mainFileName && name.startsWith("$mainFileBaseName.") && (name.endsWith(".kt") || name.endsWith(".java"))
                }.forEach {
                    fixture.configureByFile(it.getName())
                }
        val file = fixture.configureByFile(mainFileName) as JetFile

        val addKotlinRuntime = InTextDirectivesUtils.findStringWithPrefixes(file.getText(), "// WITH_RUNTIME") != null
        if (addKotlinRuntime) {
            ConfigLibraryUtil.configureKotlinRuntime(myModule, PluginTestCaseBase.mockJdk())
        }

        try {
            action(file)

            assert(!conflictFile.exists(), "Conflict file $conflictFile should not exist")
            JetTestUtils.assertEqualsToFile(afterFile, file.getText()!!)
        }
        catch(e: Exception) {
            val message = if (e is ConflictsInTestsException) e.getMessages().sort().joinToString(" ") else e.getMessage()
            JetTestUtils.assertEqualsToFile(conflictFile, message?.replace("\n", " ") ?: e.javaClass.getName())
        }
        finally {
            if (addKotlinRuntime) {
                ConfigLibraryUtil.unConfigureKotlinRuntime(myModule, PluginTestCaseBase.mockJdk())
            }
        }
    }
}
