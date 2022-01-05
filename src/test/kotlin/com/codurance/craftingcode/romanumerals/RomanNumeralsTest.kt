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
        "VI, 6",
        "XI, 11",
        "LI, 51",
        "CI, 101",
        "DI, 501",
        "MI, 1001"
    )
    fun testWhenNumberLetterPlusOneThenCorrectRomanLetter(roman: String, number: Int) {
        assertsNumbers(roman, number)
    }

    @ParameterizedTest
    @CsvSource(
        "XV, 15",
        "LV, 55",
        "CV, 105",
        "DV, 505",
        "MV, 1005"
    )
    fun testWhenNumberLetterPlusFiveThenCorrectRomanLetter(roman: String, number: Int) {
        assertsNumbers(roman, number)
    }

    @ParameterizedTest
    @CsvSource(
        "XX, 20",
        "LX, 60",
        "CX, 110",
        "DX, 510",
        "MX, 1010"
    )
    fun testWhenNumberLetterPlusTenThenCorrectRomanLetter(roman: String, number: Int) {
        assertsNumbers(roman, number)
    }

    @ParameterizedTest
    @CsvSource(
        "CL, 150",
        "DL, 550",
        "ML, 1050"
    )
    fun testWhenNumberLetterPlusFiftyThenCorrectRomanLetter(roman: String, number: Int) {
        assertsNumbers(roman, number)
    }

    @ParameterizedTest
    @CsvSource(
        "CC, 200",
        "DC, 600",
        "MC, 1100"
    )
    fun testWhenNumberLetterPlusOneHundredThenCorrectRomanLetter(roman: String, number: Int) {
        assertsNumbers(roman, number)
    }

    @ParameterizedTest
    @CsvSource(
        "MD, 1500"
    )
    fun testWhenNumberLetterPlusFiveHundredThenCorrectRomanLetter(roman: String, number: Int) {
        assertsNumbers(roman, number)
    }

    @ParameterizedTest
    @CsvSource(
        "MM, 2000"
    )
    fun testWhenNumberLetterPlusThousendThenCorrectRomanLetter(roman: String, number: Int) {
        assertsNumbers(roman, number)
    }


    private fun assertsNumbers(roman: String, number: Int) {
        val result = convert(number)
        assertEquals(roman, result)
    }
}

