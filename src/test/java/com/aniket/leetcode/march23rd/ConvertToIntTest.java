package com.aniket.leetcode.march23rd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertToIntTest {

    @Before
    public void setUp() throws Exception {
        ConvertToInt convertToInt = new ConvertToInt();
    }

    @Test
    public void testConvertToInt() {
        assertEquals(3,ConvertToInt.romanToInt("III"));
        assertEquals(58,ConvertToInt.romanToInt("LVIII"));
        assertEquals(1994,ConvertToInt.romanToInt("MCMXCIV"));
        assertEquals(4,ConvertToInt.romanToInt("IV"));
    }
}