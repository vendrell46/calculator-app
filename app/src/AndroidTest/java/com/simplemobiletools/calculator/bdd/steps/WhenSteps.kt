package com.simplemobiletools.calculator.bdd.steps

import com.simplemobiletools.calculator.bdd.action.KeyNumber
import com.simplemobiletools.calculator.bdd.pom.MainPage
import com.simplemobiletools.calculator.bdd.pom.SettingsPage
import cucumber.api.java.en.When

class WhenSteps {

    private val mainPage = MainPage()
    private val settingsPage = SettingsPage()

    @When("^sum two numbers?(?:, (.*) and (.*)?)?$")
    fun sum(firstNumber: KeyNumber?, secondNumber: KeyNumber?) {
        mainPage.sumNumbers()
    }

    @When("^subtract two numbers?(?:, (.*) and (.*)?)?$")
    fun subtract_two_numbers(firstNumber: KeyNumber?, secondNumber: KeyNumber?) {
        mainPage.subtractNumbers()
    }

    @When("^multiply two numbers?(?:, (.*) and (.*)?)?$")
    fun multiply_two_numbers(firstNumber: KeyNumber?, secondNumber: KeyNumber?) {
        mainPage.multiplyNumbers()
    }

    @When("^divide two numbers?(?:, (.*) and (.*)?)?$")
    fun divide_two_numbers(firstNumber: KeyNumber?, secondNumber: KeyNumber?) {
        mainPage.divideNumbers()
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