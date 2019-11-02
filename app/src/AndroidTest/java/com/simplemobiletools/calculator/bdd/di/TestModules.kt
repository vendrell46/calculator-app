package com.simplemobiletools.calculator.bdd.di

import com.simplemobiletools.calculator.bdd.core.ActivityTracker
import com.simplemobiletools.calculator.bdd.core.TestSetup
import com.simplemobiletools.calculator.bdd.pom.MainPage
import com.simplemobiletools.calculator.bdd.steps.GivenSteps
import com.simplemobiletools.calculator.bdd.steps.ThenSteps
import com.simplemobiletools.calculator.bdd.steps.WhenSteps
import org.koin.core.context.startKoin
import org.koin.dsl.module

private val pom = module {
    single { MainPage() }
}

private val steps = module {
    single { GivenSteps() }
    single { WhenSteps() }
    single { ThenSteps() }
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
//            steps
        )
    )
}
