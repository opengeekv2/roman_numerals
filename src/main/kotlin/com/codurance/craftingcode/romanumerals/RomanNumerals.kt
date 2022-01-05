package com.codurance.craftingcode.romanumerals

fun convert(number: Int): String? {
    val items = LinkedHashMap<Int, String>()

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
    } else {
        for (key in items.keys) {
            if (items.containsKey(number - key)) {
                result = items[number - key] + items[key]
                break
            }
        }
    }

    return result
}

