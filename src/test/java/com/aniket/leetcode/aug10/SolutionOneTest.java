package com.aniket.leetcode.aug10;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionOneTest {

    SolutionOne so = new SolutionOne();

    @Test
    public void testPositiveScenario() {
        assertEquals(Arrays.toString(new int[]{1,2,4}),Arrays.toString(so.plusOne(new int[]{1,2,3})));
        assertEquals(Arrays.toString(new int[]{4,3,2,2}),Arrays.toString(so.plusOne(new int[]{4,3,2,1})));
        assertEquals(Arrays.toString(new int[]{1,0}),Arrays.toString(so.plusOne(new int[]{9})));
    }

    }
