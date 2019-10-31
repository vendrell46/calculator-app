package com.simplemobiletools.calculator.bdd.steps

import com.simplemobiletools.calculator.bdd.pom.MainPage
import cucumber.api.java.en.Then

class ThenSteps {

    private val mainPage = MainPage()

    @Then("^check result$")
    fun check_result() {
        mainPage.checkResult()
    }
}