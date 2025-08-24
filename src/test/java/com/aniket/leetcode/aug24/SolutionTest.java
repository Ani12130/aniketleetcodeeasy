package com.aniket.leetcode.aug24;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

//Question Link : https://leetcode.com/problems/search-insert-position/description/?envType=problem-list-v2&envId=array
public class SolutionTest {
 Solution so = new Solution();

    @Test
    public void testPositiveScenario() {
        assertEquals(2,so.searchInsert(new int[] {1,3,5,6},5));
    }
    @Test
    public void testNegativeScenario() {
        assertEquals(1,so.searchInsert(new int[] {1,3,5,6},2));
        assertEquals(4,so.searchInsert(new int[] {1,3,5,6},7));
    }
}


