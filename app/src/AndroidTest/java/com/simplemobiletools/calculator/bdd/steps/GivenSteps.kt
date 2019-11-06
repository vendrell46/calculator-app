package com.simplemobiletools.calculator.bdd.steps

import com.simplemobiletools.calculator.bdd.action.KeyNumber
import com.simplemobiletools.calculator.bdd.action.KeyOperations
import com.simplemobiletools.calculator.bdd.pom.MainPage
import cucumber.api.java.en.Given
import org.koin.core.KoinComponent
import org.koin.core.inject

class GivenSteps : KoinComponent {

    private val mainPage: MainPage by inject()

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
            clickNumberKey(KeyNumber.FOUR)
            clickNumberKey(KeyNumber.TWO)
        }
    }

    @Given("^I have NaN displayed on screen$")
    fun nan_displayed() {
        app_started()
        mainPage.run {
            getNegativeNumber(KeyNumber.FOUR)
            clickOperationKey(KeyOperations.ROOT)
        }
    }
}