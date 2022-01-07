package com.codurance.craftingcode.romanumerals

fun convert(number: Int): String {

    val romanDigits = LinkedHashMap<Int, String>()
    romanDigits[40] = "XL"
    romanDigits[10] = "X"
    romanDigits[9] = "IX"
    romanDigits[5] = "V"
    romanDigits[4] = "IV"
    romanDigits[1] = "I"

    if (number >= 40) {
        return romanDigits[40]!! + convert(number - 40)
    }

    if (number >= 10) {
        return romanDigits[10]!! + convert(number - 10)
    }

    if (number >= 9) {
        return romanDigits[9]!! + convert(number - 9)
    }

    if (number >= 5) {
        return romanDigits[5]!! + convert(number - 5)
    }

    if (number >= 4) {
        return romanDigits[4]!! + convert(number - 4)
    }

    if (number >= 1) {
        return romanDigits[1]!! + convert(number - 1)
    }

    return ""
}