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

package org.jetbrains.kotlin.idea.codeInsight

import com.intellij.openapi.actionSystem.IdeActions
import com.intellij.openapi.util.io.FileUtil
import com.intellij.psi.PsiFile
import org.jetbrains.kotlin.idea.AbstractCopyPasteTest
import org.jetbrains.kotlin.idea.PluginTestCaseBase
import org.jetbrains.kotlin.idea.testUtils.dumpTextWithErrors
import org.jetbrains.kotlin.idea.util.application.runWriteAction
import org.jetbrains.kotlin.psi.JetFile
import org.jetbrains.kotlin.test.InTextDirectivesUtils
import org.jetbrains.kotlin.test.JetTestUtils
import java.io.File

public abstract class AbstractInsertImportOnPasteTest : AbstractCopyPasteTest() {
    private val BASE_PATH = PluginTestCaseBase.getTestDataPathBase() + "/copyPaste/imports"

    private val NO_ERRORS_DUMP_DIRECTIVE = "// NO_ERRORS_DUMP"
    private val DELETE_DEPENDENCIES_BEFORE_PASTE_DIRECTIVE = "// DELETE_DEPENDENCIES_BEFORE_PASTE"

    override fun getTestDataPath() = BASE_PATH

    protected fun doTestCut(path: String) {
        doTestAction(IdeActions.ACTION_CUT, path)
    }

    protected fun doTestCopy(path: String) {
        doTestAction(IdeActions.ACTION_COPY, path)
    }

    private fun doTestAction(cutOrCopy: String, path: String) {
        myFixture.setTestDataPath(BASE_PATH)
        val testFile = File(path)
        val testFileText = FileUtil.loadFile(testFile, true)
        val testFileName = testFile.getName()

        val dependencyPsiFile1 = configureByDependencyIfExists(testFileName.replace(".kt", ".dependency.kt"))
        val dependencyPsiFile2 = configureByDependencyIfExists(testFileName.replace(".kt", ".dependency.java"))
        myFixture.configureByFile(testFileName)
        myFixture.performEditorAction(cutOrCopy)

        if (InTextDirectivesUtils.isDirectiveDefined(testFileText, DELETE_DEPENDENCIES_BEFORE_PASTE_DIRECTIVE)) {
            assert(dependencyPsiFile1 != null || dependencyPsiFile2 != null)
            runWriteAction {
                dependencyPsiFile1?.getVirtualFile()?.delete(null)
                dependencyPsiFile2?.getVirtualFile()?.delete(null)
            }
        }

        KotlinCopyPasteReferenceProcessor.declarationsToImportSuggested = emptyList()

        configureTargetFile(testFileName.replace(".kt", ".to.kt"))
        performNotWriteEditorAction(IdeActions.ACTION_PASTE)

        val namesToImportDump = KotlinCopyPasteReferenceProcessor.declarationsToImportSuggested.joinToString("\n")
        JetTestUtils.assertEqualsToFile(File(path.replace(".kt", ".expected.names")), namesToImportDump)

        val resultFile = myFixture.getFile() as JetFile
        val resultText = if (InTextDirectivesUtils.isDirectiveDefined(testFileText, NO_ERRORS_DUMP_DIRECTIVE))
            resultFile.getText()
        else
            resultFile.dumpTextWithErrors()
        JetTestUtils.assertEqualsToFile(File(path.replace(".kt", ".expected.kt")), resultText)
    }
}
