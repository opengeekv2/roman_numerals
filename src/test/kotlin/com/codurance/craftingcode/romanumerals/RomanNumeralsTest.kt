package com.codurance.craftingcode.romanumerals

import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals

class RomanNumeralsTest {

    @ParameterizedTest
    @CsvSource(
        "I, 1",
        "II, 2",
        "V, 5",
        "X, 10",
        "L, 50",
        "C, 100",
        "D, 500"
    )
    fun testNumbers(roman: String, number: Int) {
        val result = convert(number)
        assertEquals(roman, result)
    }
}

