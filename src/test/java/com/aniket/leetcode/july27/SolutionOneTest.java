package com.aniket.leetcode.july27;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionOneTest {
    SolutionOne so = new SolutionOne();

    @Test
    public void testPositiveScenario() {
        boolean result = so.isAnagram("anagram","nagaram");
        assertEquals(true,result);
    }
    @Test
    public void testNegativeScenario() {
        boolean result = so.isAnagram("rat","car");
        assertEquals(false,result);
    }
}

