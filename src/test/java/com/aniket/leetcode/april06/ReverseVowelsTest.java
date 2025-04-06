package com.aniket.leetcode.april06;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ReverseVowelsTest {

    @Before
    public void setUp() throws Exception {
        ReverseVowels rw = new ReverseVowels();
    }

    @Test
    public void testReverseVowelsS1() {
        assertEquals("AceCreIm",ReverseVowels.reverseVowels("IceCreAm"));
    }

    @Test
    public void testReverseVowelsS2() {
        assertEquals("leotcede",ReverseVowels.reverseVowels("leetcode"));
    }
    @Test
    public void testReverseVowelsS3() {
        assertNotNull(ReverseVowels.reverseVowels("IceCreAm"));
        assertNotNull(ReverseVowels.reverseVowels("leetcode"));
    }
}
