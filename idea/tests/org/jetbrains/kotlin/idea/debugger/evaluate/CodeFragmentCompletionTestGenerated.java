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

package org.jetbrains.kotlin.idea.debugger.evaluate;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.JetTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/completion/basic/codeFragments")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class CodeFragmentCompletionTestGenerated extends AbstractCodeFragmentCompletionTest {
    public void testAllFilesPresentInCodeFragments() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/completion/basic/codeFragments"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("blockCodeFragment.kt")
    public void testBlockCodeFragment() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/basic/codeFragments/blockCodeFragment.kt");
        doTest(fileName);
    }

    @TestMetadata("classHeader.kt")
    public void testClassHeader() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/basic/codeFragments/classHeader.kt");
        doTest(fileName);
    }

    @TestMetadata("localVal.kt")
    public void testLocalVal() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/basic/codeFragments/localVal.kt");
        doTest(fileName);
    }

    @TestMetadata("localVariables.kt")
    public void testLocalVariables() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/basic/codeFragments/localVariables.kt");
        doTest(fileName);
    }

    @TestMetadata("localVariablesOnReturn.kt")
    public void testLocalVariablesOnReturn() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/basic/codeFragments/localVariablesOnReturn.kt");
        doTest(fileName);
    }

    @TestMetadata("topLevel.kt")
    public void testTopLevel() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/basic/codeFragments/topLevel.kt");
        doTest(fileName);
    }

    @TestMetadata("idea/testData/completion/basic/codeFragments/runtimeType")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class RuntimeType extends AbstractCodeFragmentCompletionTest {
        public void testAllFilesPresentInRuntimeType() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/completion/basic/codeFragments/runtimeType"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("castWithGenerics.kt")
        public void testCastWithGenerics() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/basic/codeFragments/runtimeType/castWithGenerics.kt");
            doTest(fileName);
        }

        @TestMetadata("complexHierarchy.kt")
        public void testComplexHierarchy() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/basic/codeFragments/runtimeType/complexHierarchy.kt");
            doTest(fileName);
        }

        @TestMetadata("extensionMethod.kt")
        public void testExtensionMethod() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/basic/codeFragments/runtimeType/extensionMethod.kt");
            doTest(fileName);
        }

        @TestMetadata("runtimeCast.kt")
        public void testRuntimeCast() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/basic/codeFragments/runtimeType/runtimeCast.kt");
            doTest(fileName);
        }
    }
}
