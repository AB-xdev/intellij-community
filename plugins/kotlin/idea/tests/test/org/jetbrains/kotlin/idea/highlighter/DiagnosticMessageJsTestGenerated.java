/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.highlighter;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.*;
import org.junit.runner.RunWith;

/*
 * This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}.
 * DO NOT MODIFY MANUALLY.
 */
@SuppressWarnings("all")
@TestRoot("idea")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/diagnosticMessage/js")
public class DiagnosticMessageJsTestGenerated extends AbstractDiagnosticMessageJsTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, TargetBackend.JS, testDataFilePath);
    }

    @TestMetadata("jsCodeErrorHtml.kt")
    public void testJsCodeErrorHtml() throws Exception {
        runTest("testData/diagnosticMessage/js/jsCodeErrorHtml.kt");
    }

    @TestMetadata("jsCodeErrorText.kt")
    public void testJsCodeErrorText() throws Exception {
        runTest("testData/diagnosticMessage/js/jsCodeErrorText.kt");
    }
}
