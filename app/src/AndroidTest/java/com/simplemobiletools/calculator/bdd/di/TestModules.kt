package com.simplemobiletools.calculator.bdd.di

import com.simplemobiletools.calculator.bdd.core.ActivityTracker
import com.simplemobiletools.calculator.bdd.core.TestSetup
import com.simplemobiletools.calculator.bdd.pom.CustomizeColorsPage
import com.simplemobiletools.calculator.bdd.pom.MainPage
import com.simplemobiletools.calculator.bdd.pom.SettingsPage
import org.koin.core.context.startKoin
import org.koin.dsl.module

private val pom = module {
    single { MainPage() }
    single { SettingsPage() }
    single { CustomizeColorsPage() }
}

private val setup = module {
    single { TestSetup() }
    single { ActivityTracker() }
}

fun initDI() = startKoin {
    modules(
        listOf(
            pom,
            setup
        )
    )
}
