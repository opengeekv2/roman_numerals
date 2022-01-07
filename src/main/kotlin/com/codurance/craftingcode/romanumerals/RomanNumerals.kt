package com.codurance.craftingcode.romanumerals

fun convert(number: Int): String {

    val romanDigits = HashMap<Int, String>()
    romanDigits[9] = "IX"
    romanDigits[5] = "V"
    romanDigits[4] = "IV"
    val romanOne = "I"

    if (romanDigits.containsKey(number)) {
        return romanDigits[number] + convert(number - number)
    }

    if (number >= 1) {
        return convert(number-1) + romanOne
    }

    return ""
}