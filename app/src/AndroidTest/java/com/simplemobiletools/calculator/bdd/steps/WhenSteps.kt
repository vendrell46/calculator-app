package com.simplemobiletools.calculator.bdd.steps

import com.simplemobiletools.calculator.bdd.pom.MainPage
import com.simplemobiletools.calculator.bdd.pom.SettingsPage
import cucumber.api.java.en.When

class WhenSteps {

    private val mainPage = MainPage()
    private val settingsPage = SettingsPage()

    @When("^sum two numbers$")
    fun sum() {
        mainPage.sumNumbers()
    }

    @When("^I navigate to Customize colors page$")
    fun navigate_to_customize_colors_page() {
        settingsPage.clickCustomizeColorsOption()
    }
}