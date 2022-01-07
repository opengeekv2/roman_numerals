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

    @Test
    fun test5isV() {
        val test = 5
        val result = convert(test)
        assertEquals("V", result)
    }

    @Test
    fun test6isVI() {
        val test = 6
        val result = convert(test)
        assertEquals("VI", result)
    }

    @Test
    fun test8isVIII() {
        val test = 8
        val result = convert(test)
        assertEquals("VIII", result)
    }

    @Test
    fun test9isIX() {
        val test = 9
        val result = convert(test)
        assertEquals("IX", result)
    }
}
