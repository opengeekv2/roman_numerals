package com.codurance.craftingcode.romanumerals

fun convert(number: Int): String {

    val romanDigits = HashMap<Int, String>()
    romanDigits[40] = "XL"
    romanDigits[10] = "X"
    romanDigits[9] = "IX"
    romanDigits[5] = "V"
    romanDigits[4] = "IV"
    romanDigits[1] = "I"

    if (romanDigits.containsKey(number)) {
        return romanDigits[number]!!
    }

    if (number > 40) {
        return convert(40) + convert(number - 40)
    }

    if (number > 10) {
        return convert(10) + convert(number - 10)
    }

    if (number > 0) {
        return convert(number-1) + convert(1)
    }

    return ""
}