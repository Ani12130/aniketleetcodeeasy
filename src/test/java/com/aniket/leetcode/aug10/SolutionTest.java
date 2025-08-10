package com.aniket.leetcode.aug10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public  class SolutionTest {

    Solution so = new Solution();

    @Test
    public void testPositiveScenario() {
        assertEquals(true,so.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    public void testNegativeScenario() {
        assertEquals(false,so.isSubsequence("axc", "ahbgdc"));
    }
}