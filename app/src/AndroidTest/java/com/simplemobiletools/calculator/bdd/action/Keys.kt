package com.simplemobiletools.calculator.bdd.action

import androidx.annotation.IdRes
import com.simplemobiletools.calculator.R

enum class KeyNumber(@IdRes val id: Int, val string: String) {
    ZERO(R.id.btn_0, "0"),
    ONE(R.id.btn_1, "1"),
    TWO(R.id.btn_2, "2"),
    THREE(R.id.btn_3, "3"),
    FOUR(R.id.btn_4, "4"),
    FIVE(R.id.btn_5, "5"),
    SIX(R.id.btn_6, "6"),
    SEVEN(R.id.btn_7, "7"),
    EIGHT(R.id.btn_8, "8"),
    NINE(R.id.btn_9, "9")
}

enum class KeyOperations(@IdRes val id: Int) {
    PERCENT(R.id.btn_percent),
    POWER(R.id.btn_power),
    ROOT(R.id.btn_root),
    DIVIDE(R.id.btn_divide),
    MULTIPLY(R.id.btn_multiply),
    MINUS(R.id.btn_minus),
    PLUS(R.id.btn_plus),
    EQUALS(R.id.btn_equals)
}

enum class KeyOthers(@IdRes val id: Int) {
    DECIMAL(R.id.btn_decimal)
}