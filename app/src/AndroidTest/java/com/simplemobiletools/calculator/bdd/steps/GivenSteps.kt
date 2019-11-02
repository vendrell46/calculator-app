package com.simplemobiletools.calculator.bdd.steps

import com.simplemobiletools.calculator.bdd.pom.MainPage
import cucumber.api.java.en.Given

class GivenSteps {

    private val mainPage = MainPage()

    @Given("^app is ready to use$")
    fun app_started() {
        mainPage.mainPageLoaded()
    }

    @Given("^I am on Settings page$")
    fun i_am_on_settings_page() {
        app_started()
        mainPage.openSettings()
    }

    @Given("^I have two digits entered$")
    fun i_have_two_digits_entered() {
        app_started()
        mainPage.run {
            clickNumber4()
            clickNumber2()
        }
    }
}