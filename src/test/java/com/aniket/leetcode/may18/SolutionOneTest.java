package com.aniket.leetcode.may18;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionOneTest {

    SolutionOne so = new SolutionOne();

    @Test
    public void testHappyNumber() {
        assertEquals(true, so.isHappy(19));
        assertEquals(false,so.isHappy(2));
    }
}
