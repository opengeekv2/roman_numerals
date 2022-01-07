package com.codurance.craftingcode.romanumerals

fun convert(number: Int): String {

    var romanOne = "I"
    var romanFive = "V"

    if (number == 5) {
        return romanFive
    }

    if (number == 4) {
        return romanOne + romanFive
    }

    if (number >= 1) {
        return convert(number-1) + romanOne
    }

    return ""
}