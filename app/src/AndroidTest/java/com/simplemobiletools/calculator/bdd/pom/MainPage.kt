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

    private fun clickOperationKey(keyOperations: KeyOperations) {
        key(keyOperations.id).perform(click())
        updateDisplay(action = Action.OPERATION)
    }

    fun clickDecimal(keyOthers: KeyOthers) {
        key(keyOthers.id).perform(click())
    }

    fun clickClearBtn() {
        clearBtn.perform( click() )
        updateDisplay(action = Action.CLEAR)
    }

    fun longClickClearBtn() {
        clearBtn.perform( longClick() )
        updateDisplay(action = Action.CLEAR_ALL)
    }

    fun openSettings() {
        menu.perform( click() )
        settings.perform( click() )
    }

    fun sumNumbers(firstNumber: KeyNumber? = KeyNumber.TWO, secondNumber: KeyNumber? = KeyNumber.FOUR) {
        clickNumberKey(firstNumber)
        clickOperationKey(KeyOperations.PLUS)
        clickNumberKey(secondNumber)
        clickOperationKey(KeyOperations.EQUALS)
    }

    fun subtractNumbers(firstNumber: KeyNumber? = KeyNumber.EIGHT, secondNumber: KeyNumber? = KeyNumber.FOUR) {
        clickNumberKey(firstNumber)
        clickOperationKey(KeyOperations.MINUS)
        clickNumberKey(secondNumber)
        clickOperationKey(KeyOperations.EQUALS)
    }

    fun multiplyNumbers(firstNumber: KeyNumber? = KeyNumber.TWO, secondNumber: KeyNumber? = KeyNumber.FIVE) {
        clickNumberKey(firstNumber)
        clickOperationKey(KeyOperations.MULTIPLY)
        clickNumberKey(secondNumber)
        clickOperationKey(KeyOperations.EQUALS)
    }

    fun divideNumbers(firstNumber: KeyNumber? = KeyNumber.SIX, secondNumber: KeyNumber? = KeyNumber.THREE) {
        clickNumberKey(firstNumber)
        clickOperationKey(KeyOperations.DIVIDE)
        clickNumberKey(secondNumber)
        clickOperationKey(KeyOperations.EQUALS)
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