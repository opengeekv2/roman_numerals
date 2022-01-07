package com.codurance.craftingcode.romanumerals

fun convert(number: Int): String {
    if (number >= 1) {
        return "I" + convert(number-1)
    }
    return ""
}