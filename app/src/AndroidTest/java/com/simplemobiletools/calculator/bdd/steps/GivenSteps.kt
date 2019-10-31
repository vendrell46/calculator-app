package com.simplemobiletools.calculator.bdd.steps

import com.simplemobiletools.calculator.bdd.pom.MainPage
import cucumber.api.java.en.Given

class GivenSteps {

    private val mainPage = MainPage()

    @Given("^app is ready to use$")
    fun app_started() {
        mainPage.mainPageLoaded()
        Thread.sleep(5000)
    }
}