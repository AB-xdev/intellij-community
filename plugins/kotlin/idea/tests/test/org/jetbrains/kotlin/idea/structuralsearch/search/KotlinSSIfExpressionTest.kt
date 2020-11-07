/*
 * Copyright 2000-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.structuralsearch.search

import org.jetbrains.kotlin.idea.structuralsearch.KotlinSSResourceInspectionTest

class KotlinSSIfExpressionTest : KotlinSSResourceInspectionTest() {
    override fun getBasePath(): String = "ifExpression"

    fun testIf() { doTest("if(true) b = true") }

    fun testIfElse() { doTest("if(true) 1 else 2") }

    fun testIfBlock() {
        doTest(
            """
            if(true) {
|               a = 1
|           }""".trimMargin()
        )
    }

    fun testIfElseBlock() {
        doTest(
            """
            if (a == 1) {
                a = 2
            } else {
                a = 3
            }""".trimMargin()
        )
    }

    fun testIfElseCondition() {
        doTest(
            """
            if (a == 1) {
                a = 2
            } else {
                a = 3
            }""".trimMargin()
        )
    }

    fun testIfThen1Expr() {
        doTest("if ('_) { '_{1,1} }")
    }
}