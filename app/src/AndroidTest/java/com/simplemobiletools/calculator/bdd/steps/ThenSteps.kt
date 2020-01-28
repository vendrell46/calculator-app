package com.simplemobiletools.calculator.bdd.steps

import com.simplemobiletools.calculator.bdd.action.KeyNumber
import com.simplemobiletools.calculator.bdd.action.KeyOperations
import com.simplemobiletools.calculator.bdd.pom.CustomizeColorsPage
import com.simplemobiletools.calculator.bdd.pom.MainPage
import cucumber.api.java.en.Then
import org.koin.core.KoinComponent
import org.koin.core.inject

class ThenSteps : KoinComponent {

    private val mainPage: MainPage by inject()
    private val customizeColorsPage: CustomizeColorsPage by inject()

    @Then("^check number displayed is (.*)$")
    fun check_result(number: String) {
        mainPage.checkNumberDisplayed(number)
    }

    @Then("^check key number (.*) pressed is displayed$")
    fun key_pressed_displayed(number: KeyNumber) {
        mainPage.checkNumberDisplayed(number.string)
    }

    @Then("^all available theme options are displayed$")
    fun all_them_options_displayed() {
        customizeColorsPage.allThemeOptionsAvailableDisplayed()
    }

    @Then("^app is still functional$")
    fun app_still_functional() {
        mainPage.operateNumbers(KeyOperations.PLUS)
    }
}