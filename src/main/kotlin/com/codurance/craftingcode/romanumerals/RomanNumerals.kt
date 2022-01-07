package com.codurance.craftingcode.romanumerals

fun convert(number: Int): String {

    val romanDigits = HashMap<Int, String>()
    romanDigits[9] = "IX"
    romanDigits[10] = "X"
    romanDigits[5] = "V"
    romanDigits[4] = "IV"
    val romanOne = "I"

    if (romanDigits.containsKey(number)) {
        return romanDigits[number]!!
    }

    if (number > 10) {
        return convert(10) + convert(number - 10)
    }

    if (number >= 1) {
        return convert(number-1) + romanOne
    }

    return ""
}