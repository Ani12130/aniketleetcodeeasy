package com.aniket.leetcode.april27th;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TwoSumTest {
    @Before
    public void setUp() throws Exception {
        TwoSum ts = new TwoSum();
    }

    @Test
    public void testTwoSum() {
        int nums[] ={2,7,11,15};
        int nums1[] ={3,2,4};
        int nums2[]={3,3};
        assertNotNull(TwoSum.findTwoSum(nums,9));
        assertNotNull(TwoSum.findTwoSum(nums1,6));
        assertNotNull(TwoSum.findTwoSum(nums2,6));
    }
}
