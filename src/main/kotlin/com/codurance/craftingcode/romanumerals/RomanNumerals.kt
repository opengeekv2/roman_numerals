package com.codurance.craftingcode.romanumerals

fun convert(number: Int): String? {
    val items = LinkedHashMap<Int, String>()

    var result = ""

    items[1000] = "M"
    items[500] = "D"
    items[100] = "C"
    items[50] = "L"
    items[10] = "X"
    items[5] = "V"
    items[1] = "I"

    if (items.containsKey(number)) {
        result += items[number]
    } else {
        for (key in items.keys) {
            if (items.containsKey(number - key)) {
                result = items[key] + items[number - key]
                break
            }
            if (items.containsKey(number - key - 1)) {
                result = items[key] + items[number - key - 1] + 'I'
                break
            }
            try {
                if (items[number - key - 10]!! .equals("X")) {
                    result = items[key] + items[number - key - 10] + 'X'
                    break
                }
            }
            catch (ex: Exception) {
                try {
                    if (items[number - key - 100]!! .equals("C")) {
                        result = items[key] + items[number - key - 100] + 'C'
                        break
                    }
                }
                catch (ex: Exception) {
                    try {
                        if (items[number - key - 1000]!! .equals("M")) {
                            result = items[key] + items[number - key - 1000] + 'M'
                            break
                        }
                    }
                    catch (ex: Exception) {
                        continue
                    }
                }
                continue
            }
        }
    }

    return result
}

