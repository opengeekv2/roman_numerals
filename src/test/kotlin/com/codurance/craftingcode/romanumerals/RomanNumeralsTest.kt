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

    @Test
    fun test10isX() {
        val test = 10
        val result = convert(test)
        assertEquals("X", result)
    }

    @Test
    fun test11isXI() {
        val test = 11
        val result = convert(test)
        assertEquals("XI", result)
    } 

    @Test
    fun test13isXIII() {
        val test = 13
        val result = convert(test)
        assertEquals("XIII", result)
    } 

    @Test
    fun test14isXIV() {
        val test = 14
        val result = convert(test)
        assertEquals("XIV", result)
    }
    
    @Test
    fun test15isXV() {
        val test = 15
        val result = convert(test)
        assertEquals("XV", result)
    }

    @Test
    fun test16isXVI() {
        val test = 16
        val result = convert(test)
        assertEquals("XVI", result)
    }

    @Test
    fun test18isXVIII() {
        val test = 18
        val result = convert(test)
        assertEquals("XVIII", result)
    }

    @Test
    fun test19isXIX() {
        val test = 19
        val result = convert(test)
        assertEquals("XIX", result)
    }

    @Test
    fun test20isXX() {
        val test = 20
        val result = convert(test)
        assertEquals("XX", result)
    }

    @Test
    fun test39isXXXIX() {
        val test = 39
        val result = convert(test)
        assertEquals("XXXIX", result)
    }

    @Test
    fun test40isXL() {
        val test = 40
        val result = convert(test)
        assertEquals("XL", result)
    }

    @Test
    fun test41isXLI() {
        val test = 41
        val result = convert(test)
        assertEquals("XLI", result)
    }

    @Test
    fun test50isL() {
        val test = 50
        val result = convert(test)
        assertEquals("L", result)
    }

    @Test
    fun test90isXC() {
        val test = 90
        val result = convert(test)
        assertEquals("XC", result)
    }

    @Test
    fun test100isC() {
        val test = 100
        val result = convert(test)
        assertEquals("C", result)
    }

    @Test
    fun test400isCD() {
        val test = 400
        val result = convert(test)
        assertEquals("CD", result)
    }

    @Test
    fun test500isD() {
        val test = 500
        val result = convert(test)
        assertEquals("D", result)
    }

    @Test
    fun test900isCM() {
        val test = 900
        val result = convert(test)
        assertEquals("CM", result)
    }

    @Test
    fun test1000isM() {
        val test = 1000
        val result = convert(test)
        assertEquals("M", result)
    }

    @Test
    fun test1999isMCMXCIX() {
        val test = 1999
        val result = convert(test)
        assertEquals("MCMXCIX", result)
    }

    @Test
    fun test1555isMDLV() {
        val test = 1555
        val result = convert(test)
        assertEquals("MDLV", result)
    }

    @Test
    fun test1444isMDLV() {
        val test = 1444
        val result = convert(test)
        assertEquals("MCDXLIV", result)
    }

}

