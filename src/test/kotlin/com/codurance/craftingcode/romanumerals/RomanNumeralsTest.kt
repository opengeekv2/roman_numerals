package com.codurance.craftingcode.romanumerals

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class RomanNumeralsTest {

    @Test
    fun test1isI() {
        val test = 1
        val result = convert(test)
        assertEquals("I", result)
    }

}
