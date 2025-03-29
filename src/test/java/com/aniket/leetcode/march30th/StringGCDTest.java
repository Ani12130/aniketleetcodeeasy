package com.aniket.leetcode.march30th;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.aniket.leetcode.march30th.StringGCD.gcdOfStrings;
import static org.junit.Assert.assertEquals;


public class StringGCDTest {
    private static final Logger logger = LoggerFactory.getLogger(StringGCDTest.class);

    @Test
    public void gcdOfStringsPositive() {
        String result = gcdOfStrings("ABCABC","ABC");
        assertEquals("ABC",result);
        logger.info("GCD of given strings:" + "-" + gcdOfStrings("ABCABC", "ABC"));
    }
    public void gcdOfStringsNegative() {
        String result = gcdOfStrings("LEET","CODE");
        assertEquals("",result);
        logger.info("GCD of given strings:" + "-" + gcdOfStrings("LEET", "CODE"));
    }
}



