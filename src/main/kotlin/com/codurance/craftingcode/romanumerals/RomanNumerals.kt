package com.codurance.craftingcode.romanumerals

fun convert(number: Int): String {

    val romanDigits = LinkedHashMap<Int, String>()
    romanDigits[400] = "CD"
    romanDigits[100] = "C"
    romanDigits[90] = "XC"
    romanDigits[50] = "L"
    romanDigits[40] = "XL"
    romanDigits[10] = "X"
    romanDigits[9] = "IX"
    romanDigits[5] = "V"
    romanDigits[4] = "IV"
    romanDigits[1] = "I"

    for ((value, romanDigit) in romanDigits) {
        if (number >= value) {
            return romanDigit + convert(number - value)
        }
    }

    return ""
}