package com.aniket.leetcode.april13th;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RemoveDuplicatesFromSortedArrayTest {
    RemoveDuplicatesFromSortedArray rd = new RemoveDuplicatesFromSortedArray();


    @Test
    public void removeDuplicatesTest() {
        int[] nums = new int[]{1, 1, 2};
        int[] nums1 = new int[]{0,0,1,1,1,2,2,3,3,4};
        assertEquals(2, rd.removeDuplicates(nums));
        assertEquals(5,rd.removeDuplicates(nums1));
    }
    @Test
    public void printDuplicatesTest() {
        int[] nums = new int[]{1, 1, 2};
        int[] nums1 = new int[]{0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicatesFromSortedArray.printRepeatedIntegers(nums);
        RemoveDuplicatesFromSortedArray.printRepeatedIntegers(nums1);
    }
}
