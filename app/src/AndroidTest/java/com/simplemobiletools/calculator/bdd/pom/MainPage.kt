package com.simplemobiletools.calculator.bdd.pom


import androidx.annotation.IdRes
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.longClick
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.simplemobiletools.calculator.R
import com.simplemobiletools.calculator.bdd.action.Action
import com.simplemobiletools.calculator.bdd.action.KeyNumber
import com.simplemobiletools.calculator.bdd.action.KeyOperations
import com.simplemobiletools.calculator.bdd.action.KeyOthers

class MainPage {

    private fun key(@IdRes id: Int) = onView(withId(id))
    private val resultField = onView(withId(R.id.result))
    private val menu = onView(withContentDescription("More options"))
    private val settings = onView(withText(R.string.settings))
    private val about = onView(withText(R.string.about))
    private val clearBtn = onView(withId(R.id.btn_clear))

    var displayedNumber = "0"

    fun mainPageLoaded() {
        resultField.check(matches(isDisplayed()))
    }

    fun clickNumberKey(keyNumber: KeyNumber?) {
        key(keyNumber!!.id).perform(click())
        updateDisplay(keyNumber.string, Action.ADD)
    }

    fun clickOperationKey(keyOperations: KeyOperations) {
        key(keyOperations.id).perform(click())
        updateDisplay(action = Action.OPERATION)
    }

    fun clickDecimal(keyOthers: KeyOthers) {
        key(keyOthers.id).perform(click())
    }

    fun clickClearBtn() {
        clearBtn.perform(click())
        updateDisplay(action = Action.CLEAR)
    }

    fun longClickClearBtn() {
        clearBtn.perform(longClick())
        updateDisplay(action = Action.CLEAR_ALL)
    }

    fun openSettings() {
        menu.perform(click())
        settings.perform(click())
    }

    fun operateNumbers(operation: KeyOperations, firstNumber: KeyNumber? = KeyNumber.FOUR, secondNumber: KeyNumber? = KeyNumber.TWO) {
        clickNumberKey(firstNumber)
        clickOperationKey(operation)
        clickNumberKey(secondNumber)
        clickOperationKey(KeyOperations.EQUALS)
    }

    fun operateWithDisplayedNumber(operation: KeyOperations, number: KeyNumber) {
        clickOperationKey(operation)
        clickNumberKey(number)
        clickOperationKey(KeyOperations.EQUALS)
    }

    fun calculateRootOf(number: KeyNumber) {
        clickNumberKey(number)
        clickOperationKey(KeyOperations.POWER)
    }

    fun getNegativeNumber(number: KeyNumber) {
        // Since we cannot switch the sign of the number we subtract from zero to get a negative number ready to use
        operateNumbers(KeyOperations.MINUS, KeyNumber.ZERO, number)
    }

    fun checkNumberDisplayed(number: String) {
        resultField.check(matches(withText(number)))
    }

    private fun updateDisplay(number: String? = null, action: Action) {
        val reset = "0"
        when (action) {
            Action.ADD -> {
                if (number == "0") {
                    displayedNumber = number
                } else {
                    displayedNumber += number
                }
            }
            Action.CLEAR -> displayedNumber.dropLast(1)
            Action.CLEAR_ALL,
            Action.OPERATION -> displayedNumber = reset
        }
    }
}