package com.simplemobiletools.calculator.bdd.steps

import com.simplemobiletools.calculator.bdd.pom.MainPage
import cucumber.api.java.en.When

class WhenSteps {

    private val mainPage = MainPage()

    @When("^sum two numbers$")
    fun sum() {
        mainPage.sumNumbers()
    }
}