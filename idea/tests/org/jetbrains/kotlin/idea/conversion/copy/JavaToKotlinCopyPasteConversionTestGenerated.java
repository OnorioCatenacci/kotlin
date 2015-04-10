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

package org.jetbrains.kotlin.idea.conversion.copy;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.JetTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/copyPaste/conversion")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class JavaToKotlinCopyPasteConversionTestGenerated extends AbstractJavaToKotlinCopyPasteConversionTest {
    @TestMetadata("AddImports.java")
    public void testAddImports() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/AddImports.java");
        doTest(fileName);
    }

    @TestMetadata("AddImportsButNoConversion.java")
    public void testAddImportsButNoConversion() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/AddImportsButNoConversion.java");
        doTest(fileName);
    }

    @TestMetadata("AddImportsButNoConversion2.java")
    public void testAddImportsButNoConversion2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/AddImportsButNoConversion2.java");
        doTest(fileName);
    }

    @TestMetadata("AddImportsClassInSamePackage.java")
    public void testAddImportsClassInSamePackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/AddImportsClassInSamePackage.java");
        doTest(fileName);
    }

    @TestMetadata("AddImportsDummyConflict.java")
    public void testAddImportsDummyConflict() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/AddImportsDummyConflict.java");
        doTest(fileName);
    }

    public void testAllFilesPresentInConversion() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/copyPaste/conversion"), Pattern.compile("^(.+)\\.java$"), true);
    }

    @TestMetadata("Arithmetic.java")
    public void testArithmetic() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/Arithmetic.java");
        doTest(fileName);
    }

    @TestMetadata("ClassWithNoDocComment.java")
    public void testClassWithNoDocComment() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/ClassWithNoDocComment.java");
        doTest(fileName);
    }

    @TestMetadata("Constructor.java")
    public void testConstructor() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/Constructor.java");
        doTest(fileName);
    }

    @TestMetadata("ConversionInCorrectContext.java")
    public void testConversionInCorrectContext() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/ConversionInCorrectContext.java");
        doTest(fileName);
    }

    @TestMetadata("FieldWithNoEndComment.java")
    public void testFieldWithNoEndComment() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/FieldWithNoEndComment.java");
        doTest(fileName);
    }

    @TestMetadata("FieldWithNoModifierAndNoSemicolon.java")
    public void testFieldWithNoModifierAndNoSemicolon() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/FieldWithNoModifierAndNoSemicolon.java");
        doTest(fileName);
    }

    @TestMetadata("FileWithNoPackageStatement.java")
    public void testFileWithNoPackageStatement() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/FileWithNoPackageStatement.java");
        doTest(fileName);
    }

    @TestMetadata("HalfTheWhiteSpace.java")
    public void testHalfTheWhiteSpace() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/HalfTheWhiteSpace.java");
        doTest(fileName);
    }

    @TestMetadata("Imports1.java")
    public void testImports1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/Imports1.java");
        doTest(fileName);
    }

    @TestMetadata("Imports2.java")
    public void testImports2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/Imports2.java");
        doTest(fileName);
    }

    @TestMetadata("Imports3.java")
    public void testImports3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/Imports3.java");
        doTest(fileName);
    }

    @TestMetadata("Indentation.java")
    public void testIndentation() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/Indentation.java");
        doTest(fileName);
    }

    @TestMetadata("MethodDeclarationWithNoBody.java")
    public void testMethodDeclarationWithNoBody() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/MethodDeclarationWithNoBody.java");
        doTest(fileName);
    }

    @TestMetadata("MethodReferenceWithoutQualifier.java")
    public void testMethodReferenceWithoutQualifier() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/MethodReferenceWithoutQualifier.java");
        doTest(fileName);
    }

    @TestMetadata("MethodWithNoAnnotation.java")
    public void testMethodWithNoAnnotation() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/MethodWithNoAnnotation.java");
        doTest(fileName);
    }

    @TestMetadata("MethodWithOnlyOneAnnotation.java")
    public void testMethodWithOnlyOneAnnotation() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/MethodWithOnlyOneAnnotation.java");
        doTest(fileName);
    }

    @TestMetadata("OnlyClosingBrace.java")
    public void testOnlyClosingBrace() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/OnlyClosingBrace.java");
        doTest(fileName);
    }

    @TestMetadata("OnlyOneBraceFromBlock.java")
    public void testOnlyOneBraceFromBlock() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/OnlyOneBraceFromBlock.java");
        doTest(fileName);
    }

    @TestMetadata("OnlyQualifier.java")
    public void testOnlyQualifier() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/OnlyQualifier.java");
        doTest(fileName);
    }

    @TestMetadata("RedundantTypeCast.java")
    public void testRedundantTypeCast() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/RedundantTypeCast.java");
        doTest(fileName);
    }

    @TestMetadata("RedundantTypeCast2.java")
    public void testRedundantTypeCast2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/RedundantTypeCast2.java");
        doTest(fileName);
    }

    @TestMetadata("SampleBlock.java")
    public void testSampleBlock() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/SampleBlock.java");
        doTest(fileName);
    }

    @TestMetadata("SeveralMethodsSample.java")
    public void testSeveralMethodsSample() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/SeveralMethodsSample.java");
        doTest(fileName);
    }

    @TestMetadata("SingleWordFromIdentifier.java")
    public void testSingleWordFromIdentifier() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/copyPaste/conversion/SingleWordFromIdentifier.java");
        doTest(fileName);
    }
}
