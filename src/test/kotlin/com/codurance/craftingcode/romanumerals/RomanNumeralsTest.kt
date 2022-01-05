package com.codurance.craftingcode.romanumerals

import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals

class RomanNumeralsTest {

    @ParameterizedTest
    @CsvSource(
        "I, 1",
        "V, 5",
        "X, 10",
        "L, 50",
        "C, 100",
        "D, 500",
        "M, 1000"
    )
    fun testSingleLetterNumbers(roman: String, number: Int) {
        assertsNumbers(roman, number)
    }

    @ParameterizedTest
    @CsvSource(
        "II, 2",
    )
    fun testWhenNumber2ThenII(roman: String, number: Int) {
        assertsNumbers(roman, number)
    }

    private fun assertsNumbers(roman: String, number: Int) {
        val result = convert(number)
        assertEquals(roman, result, "")
    }
}

