package com.simplemobiletools.calculator.bdd.steps

import com.simplemobiletools.calculator.bdd.pom.CustomizeColorsPage
import com.simplemobiletools.calculator.bdd.pom.MainPage
import cucumber.api.java.en.Then

class ThenSteps {

    private val mainPage = MainPage()
    private val customizeColorsPage = CustomizeColorsPage()

    @Then("^check number displayed is (.*)$")
    fun check_result(number: String) {
        mainPage.checkNumberDisplayed(number)
    }

    @Then("^all available theme options are displayed$")
    fun all_them_options_displayed() {
        customizeColorsPage.allThemeOptionsAvailableDisplayed()
    }
}