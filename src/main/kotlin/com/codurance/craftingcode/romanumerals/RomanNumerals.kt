package com.codurance.craftingcode.romanumerals

fun convert(number: Int): String? {
    val items = HashMap<Int, String>()

    var result = ""

    items[1] = "I" 
    items[5] = "V"
    items[10] = "X" 
    items[50] = "L"
    items[100] = "C" 
    items[500] = "D"
    items[1000] = "M"

    if (items.containsKey(number)) {
        result += items[number]
    } else if (items.containsKey(number - 1)) {
        result = items[number - 1] + "I"
    } else if (items.containsKey(number - 5)) {
        result = items[number - 5] + "V"
    } else {
        result = items[number - 10] + "X"
    }

    return result
}

