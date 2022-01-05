package com.codurance.craftingcode.romanumerals

fun convert(number: Int): String? {
    val digits = LinkedHashMap<Int, String>()
    val notMultiplesOfFive = LinkedHashMap<Int, String>()

    var result = ""

    digits[1000] = "M"
    digits[500] = "D"
    digits[100] = "C"
    digits[50] = "L"
    digits[10] = "X"
    digits[5] = "V"
    digits[1] = "I"

    notMultiplesOfFive[1000] = "M"
    notMultiplesOfFive[100] = "C"
    notMultiplesOfFive[10] = "X"
    notMultiplesOfFive[1] = "I"

    for (key in digits.keys) {
        try {
            if (digits.containsKey(number)) {
                result = digits[number]!!
                break
            }
        } catch (e: Exception) {
            continue
        }

        if (digits.containsKey(number - key)) {
            result = digits[key] + digits[number - key]
            break
        }

        for (notMKey in notMultiplesOfFive.keys) {
            try {
                if (digits[number - key - notMKey]!! .equals(notMultiplesOfFive[notMKey])) {
                    result = digits[key] + digits[number - key - notMKey] + notMultiplesOfFive[notMKey]
                    break
                }
            } catch (e: Exception) {
                continue
            }
        }
    }

    return result
}

