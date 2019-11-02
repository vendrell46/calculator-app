package com.simplemobiletools.calculator.bdd.core

import android.preference.PreferenceManager
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import com.simplemobiletools.calculator.activities.MainActivity
import cucumber.api.java.Before
import org.koin.core.KoinComponent
import org.koin.core.inject

class TestSetup : KoinComponent {

    private val activityTracker: ActivityTracker by inject()
    private val rule = ActivityTestRule(
        MainActivity::class.java, false, false)

    @Before
    fun before() {
        clearPreferences()
        rule.launchActivity(null)
        activityTracker.registerActivityLifecycle(rule.activity)
    }

    private fun clearPreferences() {
        val context = InstrumentationRegistry.getInstrumentation().context
        val editor = PreferenceManager.getDefaultSharedPreferences(context)
        editor.edit().clear().commit()
    }
}