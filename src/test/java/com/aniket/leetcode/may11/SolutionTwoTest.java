package com.aniket.leetcode.may11;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTwoTest {
    SolutionTwo so = new SolutionTwo();

    @Test
    public void maxProfitTest() {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};
        assertEquals(5,so.maxProfit(prices1));
        assertEquals(0,so.maxProfit(prices2));
    }
}
