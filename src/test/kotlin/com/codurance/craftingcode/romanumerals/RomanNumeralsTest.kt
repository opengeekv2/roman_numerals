package com.codurance.craftingcode.romanumerals

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class RomanNumeralsTest {

    @Test
    fun test0isEmptyString() {
        val test = 0
        val result = convert(test)
        assertEquals("", result)
    }

    @Test
    fun test1isI() {
        val test = 1
        val result = convert(test)
        assertEquals("I", result)
    }

    @Test
    fun test2isII() {
        val test = 2
        val result = convert(test)
        assertEquals("II", result)
    }

    @Test
    fun test3isIII() {
        val test = 3
        val result = convert(test)
        assertEquals("III", result)
    }

    @Test
    fun test4isIV() {
        val test = 4
        val result = convert(test)
        assertEquals("IV", result)
    }


}
