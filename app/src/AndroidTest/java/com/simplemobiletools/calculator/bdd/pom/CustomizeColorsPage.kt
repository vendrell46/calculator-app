package com.simplemobiletools.calculator.bdd.pom

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.simplemobiletools.calculator.R

class CustomizeColorsPage {

    private val themeOption = onView(withId(R.id.customization_theme_holder))
    private fun colorOption(theme: String): ViewInteraction = onView(withText(theme))


    private fun clickThemeOption() = themeOption.perform(click())

    fun allThemeOptionsAvailableDisplayed() {
        clickThemeOption()
        colorOptionDisplayed("Light")
        colorOptionDisplayed("Dark")
        colorOptionDisplayed("Dark red")
        colorOptionDisplayed("Black & White")
        colorOptionDisplayed("Custom")
    }

    private fun colorOptionDisplayed(theme: String) {
        colorOption(theme).check(matches(isDisplayed()))
    }
}