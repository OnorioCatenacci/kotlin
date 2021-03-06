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

package org.jetbrains.kotlin.completion.handlers;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.JetTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/completion/handlers/smart")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class SmartCompletionHandlerTestGenerated extends AbstractSmartCompletionHandlerTest {
    @TestMetadata("AfterAs.kt")
    public void testAfterAs() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/AfterAs.kt");
        doTest(fileName);
    }

    @TestMetadata("AfterAs2.kt")
    public void testAfterAs2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/AfterAs2.kt");
        doTest(fileName);
    }

    @TestMetadata("AfterAs3.kt")
    public void testAfterAs3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/AfterAs3.kt");
        doTest(fileName);
    }

    @TestMetadata("AfterSafeAs.kt")
    public void testAfterSafeAs() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/AfterSafeAs.kt");
        doTest(fileName);
    }

    public void testAllFilesPresentInSmart() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/completion/handlers/smart"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("AnonymousObject1.kt")
    public void testAnonymousObject1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/AnonymousObject1.kt");
        doTest(fileName);
    }

    @TestMetadata("AnonymousObject2.kt")
    public void testAnonymousObject2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/AnonymousObject2.kt");
        doTest(fileName);
    }

    @TestMetadata("AnonymousObject3.kt")
    public void testAnonymousObject3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/AnonymousObject3.kt");
        doTest(fileName);
    }

    @TestMetadata("AnonymousObjectInsertsImport.kt")
    public void testAnonymousObjectInsertsImport() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/AnonymousObjectInsertsImport.kt");
        doTest(fileName);
    }

    @TestMetadata("AutoCompleteAfterAs1.kt")
    public void testAutoCompleteAfterAs1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/AutoCompleteAfterAs1.kt");
        doTest(fileName);
    }

    @TestMetadata("AutoCompleteAfterAs2.kt")
    public void testAutoCompleteAfterAs2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/AutoCompleteAfterAs2.kt");
        doTest(fileName);
    }

    @TestMetadata("AutoCompleteAfterAs3.kt")
    public void testAutoCompleteAfterAs3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/AutoCompleteAfterAs3.kt");
        doTest(fileName);
    }

    @TestMetadata("ClassInClassObject.kt")
    public void testClassInClassObject() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/ClassInClassObject.kt");
        doTest(fileName);
    }

    @TestMetadata("ClassInObject.kt")
    public void testClassInObject() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/ClassInObject.kt");
        doTest(fileName);
    }

    @TestMetadata("ClassObjectFieldKeywordName.kt")
    public void testClassObjectFieldKeywordName() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/ClassObjectFieldKeywordName.kt");
        doTest(fileName);
    }

    @TestMetadata("ClassObjectMethod1.kt")
    public void testClassObjectMethod1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/ClassObjectMethod1.kt");
        doTest(fileName);
    }

    @TestMetadata("ClassObjectMethod2.kt")
    public void testClassObjectMethod2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/ClassObjectMethod2.kt");
        doTest(fileName);
    }

    @TestMetadata("ClassObjectMethod3.kt")
    public void testClassObjectMethod3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/ClassObjectMethod3.kt");
        doTest(fileName);
    }

    @TestMetadata("ClassObjectMethod4.kt")
    public void testClassObjectMethod4() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/ClassObjectMethod4.kt");
        doTest(fileName);
    }

    @TestMetadata("ClosingParenthesis1.kt")
    public void testClosingParenthesis1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/ClosingParenthesis1.kt");
        doTest(fileName);
    }

    @TestMetadata("ClosingParenthesis2.kt")
    public void testClosingParenthesis2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/ClosingParenthesis2.kt");
        doTest(fileName);
    }

    @TestMetadata("Comma1.kt")
    public void testComma1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/Comma1.kt");
        doTest(fileName);
    }

    @TestMetadata("Comma10.kt")
    public void testComma10() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/Comma10.kt");
        doTest(fileName);
    }

    @TestMetadata("Comma11.kt")
    public void testComma11() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/Comma11.kt");
        doTest(fileName);
    }

    @TestMetadata("Comma2.kt")
    public void testComma2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/Comma2.kt");
        doTest(fileName);
    }

    @TestMetadata("Comma3.kt")
    public void testComma3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/Comma3.kt");
        doTest(fileName);
    }

    @TestMetadata("Comma4.kt")
    public void testComma4() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/Comma4.kt");
        doTest(fileName);
    }

    @TestMetadata("Comma5.kt")
    public void testComma5() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/Comma5.kt");
        doTest(fileName);
    }

    @TestMetadata("Comma6.kt")
    public void testComma6() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/Comma6.kt");
        doTest(fileName);
    }

    @TestMetadata("Comma7.kt")
    public void testComma7() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/Comma7.kt");
        doTest(fileName);
    }

    @TestMetadata("Comma8.kt")
    public void testComma8() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/Comma8.kt");
        doTest(fileName);
    }

    @TestMetadata("Comma9.kt")
    public void testComma9() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/Comma9.kt");
        doTest(fileName);
    }

    @TestMetadata("CommaInSuperConstructorCall.kt")
    public void testCommaInSuperConstructorCall() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/CommaInSuperConstructorCall.kt");
        doTest(fileName);
    }

    @TestMetadata("Constructor.kt")
    public void testConstructor() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/Constructor.kt");
        doTest(fileName);
    }

    @TestMetadata("ConstructorForGenericType.kt")
    public void testConstructorForGenericType() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/ConstructorForGenericType.kt");
        doTest(fileName);
    }

    @TestMetadata("ConstructorForGenericType2.kt")
    public void testConstructorForGenericType2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/ConstructorForGenericType2.kt");
        doTest(fileName);
    }

    @TestMetadata("ConstructorForJavaClass.kt")
    public void testConstructorForJavaClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/ConstructorForJavaClass.kt");
        doTest(fileName);
    }

    @TestMetadata("ConstructorForNullable.kt")
    public void testConstructorForNullable() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/ConstructorForNullable.kt");
        doTest(fileName);
    }

    @TestMetadata("ConstructorInsertsImport.kt")
    public void testConstructorInsertsImport() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/ConstructorInsertsImport.kt");
        doTest(fileName);
    }

    @TestMetadata("ConstructorInsertsImport2.kt")
    public void testConstructorInsertsImport2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/ConstructorInsertsImport2.kt");
        doTest(fileName);
    }

    @TestMetadata("ConstructorWithKeywordName.kt")
    public void testConstructorWithKeywordName() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/ConstructorWithKeywordName.kt");
        doTest(fileName);
    }

    @TestMetadata("ConstructorWithLambdaParameter1.kt")
    public void testConstructorWithLambdaParameter1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/ConstructorWithLambdaParameter1.kt");
        doTest(fileName);
    }

    @TestMetadata("ConstructorWithLambdaParameter2.kt")
    public void testConstructorWithLambdaParameter2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/ConstructorWithLambdaParameter2.kt");
        doTest(fileName);
    }

    @TestMetadata("ConstructorWithParameters.kt")
    public void testConstructorWithParameters() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/ConstructorWithParameters.kt");
        doTest(fileName);
    }

    @TestMetadata("DoNotEraseBraceOnTab.kt")
    public void testDoNotEraseBraceOnTab() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/DoNotEraseBraceOnTab.kt");
        doTest(fileName);
    }

    @TestMetadata("DoNotReplaceOnEnter.kt")
    public void testDoNotReplaceOnEnter() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/DoNotReplaceOnEnter.kt");
        doTest(fileName);
    }

    @TestMetadata("EnumMember.kt")
    public void testEnumMember() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/EnumMember.kt");
        doTest(fileName);
    }

    @TestMetadata("ForLoopRange.kt")
    public void testForLoopRange() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/ForLoopRange.kt");
        doTest(fileName);
    }

    @TestMetadata("ForLoopRange2.kt")
    public void testForLoopRange2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/ForLoopRange2.kt");
        doTest(fileName);
    }

    @TestMetadata("FunctionReference1.kt")
    public void testFunctionReference1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/FunctionReference1.kt");
        doTest(fileName);
    }

    @TestMetadata("FunctionReference2.kt")
    public void testFunctionReference2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/FunctionReference2.kt");
        doTest(fileName);
    }

    @TestMetadata("GenericFunction.kt")
    public void testGenericFunction() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/GenericFunction.kt");
        doTest(fileName);
    }

    @TestMetadata("IfCondition.kt")
    public void testIfCondition() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/IfCondition.kt");
        doTest(fileName);
    }

    @TestMetadata("IfValue1.kt")
    public void testIfValue1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/IfValue1.kt");
        doTest(fileName);
    }

    @TestMetadata("IfValue2.kt")
    public void testIfValue2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/IfValue2.kt");
        doTest(fileName);
    }

    @TestMetadata("IfValue3.kt")
    public void testIfValue3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/IfValue3.kt");
        doTest(fileName);
    }

    @TestMetadata("IfValueInBlock.kt")
    public void testIfValueInBlock() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/IfValueInBlock.kt");
        doTest(fileName);
    }

    @TestMetadata("InElvisOperator.kt")
    public void testInElvisOperator() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/InElvisOperator.kt");
        doTest(fileName);
    }

    @TestMetadata("InnerClassInstantiation1.kt")
    public void testInnerClassInstantiation1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/InnerClassInstantiation1.kt");
        doTest(fileName);
    }

    @TestMetadata("InnerClassInstantiation2.kt")
    public void testInnerClassInstantiation2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/InnerClassInstantiation2.kt");
        doTest(fileName);
    }

    @TestMetadata("JavaEnumMemberInsertsImport.kt")
    public void testJavaEnumMemberInsertsImport() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/JavaEnumMemberInsertsImport.kt");
        doTest(fileName);
    }

    @TestMetadata("JavaStaticField.kt")
    public void testJavaStaticField() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/JavaStaticField.kt");
        doTest(fileName);
    }

    @TestMetadata("JavaStaticFieldInsertImport.kt")
    public void testJavaStaticFieldInsertImport() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/JavaStaticFieldInsertImport.kt");
        doTest(fileName);
    }

    @TestMetadata("JavaStaticMethod.kt")
    public void testJavaStaticMethod() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/JavaStaticMethod.kt");
        doTest(fileName);
    }

    @TestMetadata("JavaStaticMethodInsertsImport.kt")
    public void testJavaStaticMethodInsertsImport() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/JavaStaticMethodInsertsImport.kt");
        doTest(fileName);
    }

    @TestMetadata("Lambda1.kt")
    public void testLambda1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/Lambda1.kt");
        doTest(fileName);
    }

    @TestMetadata("Lambda2.kt")
    public void testLambda2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/Lambda2.kt");
        doTest(fileName);
    }

    @TestMetadata("Lambda3.kt")
    public void testLambda3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/Lambda3.kt");
        doTest(fileName);
    }

    @TestMetadata("Lambda4.kt")
    public void testLambda4() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/Lambda4.kt");
        doTest(fileName);
    }

    @TestMetadata("Lambda5.kt")
    public void testLambda5() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/Lambda5.kt");
        doTest(fileName);
    }

    @TestMetadata("LambdaInsertImport.kt")
    public void testLambdaInsertImport() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/LambdaInsertImport.kt");
        doTest(fileName);
    }

    @TestMetadata("MergeTail1.kt")
    public void testMergeTail1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/MergeTail1.kt");
        doTest(fileName);
    }

    @TestMetadata("MergeTail2.kt")
    public void testMergeTail2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/MergeTail2.kt");
        doTest(fileName);
    }

    @TestMetadata("MergeTail3.kt")
    public void testMergeTail3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/MergeTail3.kt");
        doTest(fileName);
    }

    @TestMetadata("MergeTail4.kt")
    public void testMergeTail4() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/MergeTail4.kt");
        doTest(fileName);
    }

    @TestMetadata("MultipleArgsItem.kt")
    public void testMultipleArgsItem() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/MultipleArgsItem.kt");
        doTest(fileName);
    }

    @TestMetadata("MultipleArgsItemByTab.kt")
    public void testMultipleArgsItemByTab() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/MultipleArgsItemByTab.kt");
        doTest(fileName);
    }

    @TestMetadata("NestedDataClass.kt")
    public void testNestedDataClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/NestedDataClass.kt");
        doTest(fileName);
    }

    @TestMetadata("NestedDataClassComma.kt")
    public void testNestedDataClassComma() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/NestedDataClassComma.kt");
        doTest(fileName);
    }

    @TestMetadata("NullableValue1.kt")
    public void testNullableValue1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/NullableValue1.kt");
        doTest(fileName);
    }

    @TestMetadata("NullableValue2.kt")
    public void testNullableValue2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/NullableValue2.kt");
        doTest(fileName);
    }

    @TestMetadata("NullableValue3.kt")
    public void testNullableValue3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/NullableValue3.kt");
        doTest(fileName);
    }

    @TestMetadata("NullableValueKeepOldArguments.kt")
    public void testNullableValueKeepOldArguments() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/NullableValueKeepOldArguments.kt");
        doTest(fileName);
    }

    @TestMetadata("ObjectFromType.kt")
    public void testObjectFromType() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/ObjectFromType.kt");
        doTest(fileName);
    }

    @TestMetadata("QualifiedCallReplacementBug.kt")
    public void testQualifiedCallReplacementBug() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/QualifiedCallReplacementBug.kt");
        doTest(fileName);
    }

    @TestMetadata("QualifiedThisKeywordName1.kt")
    public void testQualifiedThisKeywordName1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/QualifiedThisKeywordName1.kt");
        doTest(fileName);
    }

    @TestMetadata("QualifiedThisKeywordName2.kt")
    public void testQualifiedThisKeywordName2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/QualifiedThisKeywordName2.kt");
        doTest(fileName);
    }

    @TestMetadata("ReplaceArgument.kt")
    public void testReplaceArgument() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/ReplaceArgument.kt");
        doTest(fileName);
    }

    @TestMetadata("SAMExpected1.kt")
    public void testSAMExpected1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/SAMExpected1.kt");
        doTest(fileName);
    }

    @TestMetadata("SAMExpected2.kt")
    public void testSAMExpected2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/SAMExpected2.kt");
        doTest(fileName);
    }

    @TestMetadata("TabReplaceComma1.kt")
    public void testTabReplaceComma1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/TabReplaceComma1.kt");
        doTest(fileName);
    }

    @TestMetadata("TabReplaceComma2.kt")
    public void testTabReplaceComma2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/TabReplaceComma2.kt");
        doTest(fileName);
    }

    @TestMetadata("TabReplaceExpression.kt")
    public void testTabReplaceExpression() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/TabReplaceExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("TabReplaceExpression2.kt")
    public void testTabReplaceExpression2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/TabReplaceExpression2.kt");
        doTest(fileName);
    }

    @TestMetadata("TabReplaceExpression3.kt")
    public void testTabReplaceExpression3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/TabReplaceExpression3.kt");
        doTest(fileName);
    }

    @TestMetadata("TabReplaceExpression4.kt")
    public void testTabReplaceExpression4() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/TabReplaceExpression4.kt");
        doTest(fileName);
    }

    @TestMetadata("TabReplaceFunctionName1.kt")
    public void testTabReplaceFunctionName1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/TabReplaceFunctionName1.kt");
        doTest(fileName);
    }

    @TestMetadata("TabReplaceFunctionName2.kt")
    public void testTabReplaceFunctionName2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/TabReplaceFunctionName2.kt");
        doTest(fileName);
    }

    @TestMetadata("TabReplaceFunctionName3.kt")
    public void testTabReplaceFunctionName3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/TabReplaceFunctionName3.kt");
        doTest(fileName);
    }

    @TestMetadata("TabReplaceIdentifier.kt")
    public void testTabReplaceIdentifier() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/TabReplaceIdentifier.kt");
        doTest(fileName);
    }

    @TestMetadata("TabReplaceOperand.kt")
    public void testTabReplaceOperand() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/TabReplaceOperand.kt");
        doTest(fileName);
    }

    @TestMetadata("True.kt")
    public void testTrue() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/True.kt");
        doTest(fileName);
    }

    @TestMetadata("True2.kt")
    public void testTrue2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/True2.kt");
        doTest(fileName);
    }

    @TestMetadata("WhenElse.kt")
    public void testWhenElse() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/handlers/smart/WhenElse.kt");
        doTest(fileName);
    }
}
