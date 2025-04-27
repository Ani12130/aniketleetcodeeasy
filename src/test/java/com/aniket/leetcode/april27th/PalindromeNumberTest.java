package com.aniket.leetcode.april27th;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeNumberTest {
    @Before
    public void setUp() throws Exception {
       PalindromeNumber PalindromeNumber = new PalindromeNumber();
    }
    @Test
    public void PalindromeTest() {
        assertEquals(true,PalindromeNumber.isPalindrome(121));
        assertEquals(false,PalindromeNumber.isPalindrome(-121));
        assertEquals(false,PalindromeNumber.isPalindrome(10));

    }
}

