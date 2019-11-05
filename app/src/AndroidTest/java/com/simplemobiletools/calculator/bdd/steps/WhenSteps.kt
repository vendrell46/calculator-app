package com.simplemobiletools.calculator.bdd.steps

import com.simplemobiletools.calculator.bdd.action.KeyNumber
import com.simplemobiletools.calculator.bdd.action.KeyOperations
import com.simplemobiletools.calculator.bdd.pom.MainPage
import com.simplemobiletools.calculator.bdd.pom.SettingsPage
import cucumber.api.java.en.When
import org.koin.core.KoinComponent
import org.koin.core.inject

class WhenSteps : KoinComponent {

    private val mainPage: MainPage by inject()
    private val settingsPage: SettingsPage by inject()

    @When("^sum two numbers?(?:, (.*) and (.*)?)?$")
    fun sum(firstNumber: KeyNumber?, secondNumber: KeyNumber?) {
        mainPage.operateNumbers(KeyOperations.PLUS, firstNumber, secondNumber)
    }

    @When("^sum (.*) to a negative (.*)?$")
    fun sum_a_negative_number(number: KeyNumber, negativeNumber: KeyNumber) {
        mainPage.run {
            getNegativeNumber(negativeNumber)
            operateWithDisplayedNumber(KeyOperations.PLUS, number)
        }
    }

    @When("^subtract two numbers?(?:, (.*) and (.*)?)?$")
    fun subtract_two_numbers(firstNumber: KeyNumber?, secondNumber: KeyNumber?) {
        mainPage.operateNumbers(KeyOperations.MINUS, firstNumber, secondNumber)
    }

    @When("^subtract (.*) to a negative (.*)?$")
    fun subtract_with_negative_number(number: KeyNumber, negativeNumber: KeyNumber) {
        mainPage.run {
            getNegativeNumber(negativeNumber)
            operateWithDisplayedNumber(KeyOperations.MINUS, number)
        }
    }

    @When("^multiply two numbers?(?:, (.*) and (.*)?)?$")
    fun multiply_two_numbers(firstNumber: KeyNumber?, secondNumber: KeyNumber?) {
        mainPage.operateNumbers(KeyOperations.MULTIPLY, firstNumber, secondNumber)
    }

    @When("^multiply (.*) by a negative (.*)?$")
    fun multiply_with_negative_number(number: KeyNumber, negativeNumber: KeyNumber) {
        mainPage.run {
            getNegativeNumber(negativeNumber)
            operateWithDisplayedNumber(KeyOperations.MULTIPLY, number)
        }
    }

    @When("^divide two numbers?(?:, (.*) and (.*)?)?$")
    fun divide_two_numbers(firstNumber: KeyNumber?, secondNumber: KeyNumber?) {
        mainPage.operateNumbers(KeyOperations.DIVIDE, firstNumber, secondNumber)
    }

    @When("^divide by (.*) a negative (.*)?$")
    fun divide_with_a_negative_number(number: KeyNumber, negativeNumber: KeyNumber) {
        mainPage.run {
            getNegativeNumber(negativeNumber)
            operateWithDisplayedNumber(KeyOperations.DIVIDE, number)
        }
    }

    @When("^I calculate (.*) percent of (.*)$")
    fun calculate_percent_of(firstNumber: KeyNumber?, secondNumber: KeyNumber?) {
        mainPage.operateNumbers(KeyOperations.PERCENT, firstNumber, secondNumber)
    }

    @When("^I calculate percentage of (.*) with negative (.*)$")
    fun percentage_with_negative_number(number: KeyNumber, negativeNumber: KeyNumber) {
        mainPage.run {
            getNegativeNumber(negativeNumber)
            operateWithDisplayedNumber(KeyOperations.PERCENT, number)
        }
    }

    @When("^I calculate (.*) to the power of (.*)$")
    fun calculate_power_of(firstNumber: KeyNumber?, secondNumber: KeyNumber?) {
        mainPage.operateNumbers(KeyOperations.POWER, firstNumber, secondNumber)
    }

    @When("^I calculate negative (.*) to the power of (.*)$")
    fun calculate_power_of_negative_number(negativeNumber: KeyNumber, number: KeyNumber) {
        mainPage.run {
            getNegativeNumber(negativeNumber)
            operateNumbers(KeyOperations.POWER, number)
        }
    }

    @When("^I calculate root of (.*)$")
    fun calculate_root_of(number: KeyNumber) {
        mainPage.calculateRootOf(number)
    }

    @When("^I calculate root with negative (.*)$")
    fun calculate_root_of_negative_number(number: KeyNumber) {
        mainPage.run {
            getNegativeNumber(number)
            clickOperationKey(KeyOperations.ROOT)
        }
    }

    @When("^I navigate to Customize colors page$")
    fun navigate_to_customize_colors_page() {
        settingsPage.clickCustomizeColorsOption()
    }

    @When("^I click clear button$")
    fun i_click_clear_btn() {
        mainPage.clickClearBtn()
    }

    @When("^I long click the clear button$")
    fun i_long_click_clear_btn() {
        mainPage.longClickClearBtn()
    }
}