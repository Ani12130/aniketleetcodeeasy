package com.aniket.leetcode.july20;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionOneTest {

        SolutionOne so = new SolutionOne();


    @Test
    public void testPositiveScenario() {
        assertEquals(true,so.wordPattern("abba","dog cat cat dog"));
    }
    @Test
    public void testNegativeScenario() {
        assertEquals(false,so.wordPattern("aaaa","dog cat cat dog"));
    }
}
