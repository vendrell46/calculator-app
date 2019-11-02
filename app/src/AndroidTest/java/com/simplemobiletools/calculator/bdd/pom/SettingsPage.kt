package com.simplemobiletools.calculator.bdd.pom

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.simplemobiletools.calculator.R

class SettingsPage {

    private val customizeColorsOption = onView(withId(R.id.settings_customize_colors_holder))

    fun clickCustomizeColorsOption() {
        customizeColorsOption.perform( click() )
    }
}