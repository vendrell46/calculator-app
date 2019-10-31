package com.simplemobiletools.calculator.bdd.pom

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import com.simplemobiletools.calculator.R

class MainPage {

    private val number2 = onView(withId(R.id.btn_2))
    private val number4 = onView(withId(R.id.btn_4))
    private val sumBtn = onView(withId(R.id.btn_plus))
    private val equalsBtn = onView(withId(R.id.btn_equals))
    private val resultField = onView(withId(R.id.result))

    fun mainPageLoaded() {
        resultField.check(matches(isDisplayed()))
    }

    private fun clickNumber2() {
        number2.perform( click() )
    }

    private fun clickNumber4() {
        number4.perform( click() )
    }

    private fun clickSumBtn() {
        sumBtn.perform( click() )
    }

    private fun clickEqualsBtn() {
        equalsBtn.perform( click() )
    }

    fun sumNumbers() {
        clickNumber2()
        clickSumBtn()
        clickNumber4()
        clickEqualsBtn()
    }

    fun checkResult() {
        resultField.check(matches(withText("6")))
    }
}