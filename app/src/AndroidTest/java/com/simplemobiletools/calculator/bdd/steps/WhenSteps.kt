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

    @When("^sum two numbers?(?:, (.*) plus (.*)?)?$")
    fun sum(firstNumber: KeyNumber?, secondNumber: KeyNumber?) {
        mainPage.operateNumbers(KeyOperations.PLUS, firstNumber, secondNumber)
    }

    @When("^sum two decimal numbers, 3.3 plus 1.7$")
    fun sum_decimal_numbers() {
        mainPage.run {
            enterDecimalNumber(KeyNumber.THREE, KeyNumber.THREE)
            clickOperationKey(KeyOperations.PLUS)
            enterDecimalNumber(KeyNumber.ONE, KeyNumber.SEVEN)
            clickOperationKey(KeyOperations.EQUALS)
        }
    }

    @When("^sum (.*) to a negative (.*)?$")
    fun sum_a_negative_number(number: KeyNumber, negativeNumber: KeyNumber) {
        mainPage.run {
            getNegativeNumber(negativeNumber)
            operateWithDisplayedNumber(KeyOperations.PLUS, number)
        }
    }

    @When("^subtract two numbers?(?:, (.*) minus (.*)?)?$")
    fun subtract_two_numbers(firstNumber: KeyNumber?, secondNumber: KeyNumber?) {
        mainPage.operateNumbers(KeyOperations.MINUS, firstNumber, secondNumber)
    }

    @When("^subtract two decimal numbers, 4.5 minus 1.5$")
    fun subtract_two_numbers_with_decimals() {
        mainPage.run {
            enterDecimalNumber(KeyNumber.FOUR, KeyNumber.FIVE)
            clickOperationKey(KeyOperations.MINUS)
            enterDecimalNumber(KeyNumber.ONE, KeyNumber.FIVE)
            clickOperationKey(KeyOperations.EQUALS)
        }
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

    @When("^multiply decimal numbers 2.5 and 1.5$")
    fun multiply_two_numbers_with_decimals() {
        mainPage.run {
            enterDecimalNumber(KeyNumber.TWO, KeyNumber.FIVE)
            clickOperationKey(KeyOperations.MULTIPLY)
            enterDecimalNumber(KeyNumber.ONE, KeyNumber.FIVE)
            clickOperationKey(KeyOperations.EQUALS)
        }
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

    @When("^divide decimal number 2.5 by itself$")
    fun divide_two_numbers_with_decimals() {
        mainPage.run {
            enterDecimalNumber(KeyNumber.TWO, KeyNumber.FIVE)
            clickOperationKey(KeyOperations.DIVIDE)
            enterDecimalNumber(KeyNumber.TWO, KeyNumber.FIVE)
            clickOperationKey(KeyOperations.EQUALS)
        }
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

    @When("^I enter in calculator 2.5 percent of (.*)$")
    fun calculate_percentage_decimal_number(number: KeyNumber) {
        mainPage.run {
            enterDecimalNumber(KeyNumber.TWO, KeyNumber.FIVE)
            clickOperationKey(KeyOperations.PERCENT)
            clickNumberKey(number)
            clickOperationKey(KeyOperations.EQUALS)
        }
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

    @When("^I calculate to the power of (.*) decimal number 2.5$")
    fun calculate_power_of_decimal_number(number: KeyNumber) {
        mainPage.run {
            enterDecimalNumber(KeyNumber.TWO, KeyNumber.FIVE)
            clickOperationKey(KeyOperations.POWER)
            clickNumberKey(number)
            clickOperationKey(KeyOperations.EQUALS)
        }
    }

    @When("^I enter in calculator negative (.*) to the power of (.*)$")
    fun calculate_power_of_negative_number(negativeNumber: KeyNumber, number: KeyNumber) {
        mainPage.run {
            getNegativeNumber(negativeNumber)
            operateWithDisplayedNumber(KeyOperations.POWER, number)
        }
    }

    @When("^I calculate root of (.*)$")
    fun calculate_root_of(number: KeyNumber) {
        mainPage.calculateRootOf(number)
    }

    @When("^I calculate root with decimal number 4.9$")
    fun calculate_root_of_number_with_decimals() {
        mainPage.run {
            enterDecimalNumber(KeyNumber.FOUR, KeyNumber.NINE)
            clickOperationKey(KeyOperations.ROOT)
        }
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

    @When("^I click key number (.*)$")
    fun i_click_key_number(keyNumber: KeyNumber) {
        mainPage.clickNumberKey(keyNumber)
    }

    @When("^I click decimal key$")
    fun click_decimal_key() {
        mainPage.clickDecimalKey()
    }

    @When("^I do (.*) operation with displayed result$")
    fun operate_with_displayed_result(keyOperations: KeyOperations) {
        mainPage.operateWithDisplayedNumber(keyOperations, KeyNumber.TWO)
    }
}