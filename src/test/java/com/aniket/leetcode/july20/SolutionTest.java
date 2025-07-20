package com.aniket.leetcode.july20;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void testPositiveScenario() {
        assertEquals(true,s.isPowerOfThree(27));
    }
    @Test
    public void testNegativeScenario() {
        assertEquals(false,s.isPowerOfThree(0));
        assertEquals(false,s.isPowerOfThree(-1));
    }

}
