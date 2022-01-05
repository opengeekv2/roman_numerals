package com.codurance.craftingcode.romanumerals

fun convert(number: Int): String? {
    val items = HashMap<Int, String>()

    items[1] = "I" 
    items[2] = "II"
    items[5] = "V"
    items[10] = "X" 
    items[50] = "L"
    items[100] = "C" 

    return items[number]
}

