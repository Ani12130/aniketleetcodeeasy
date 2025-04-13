package com.aniket.leetcode.april13th;

import java.util.Arrays;
//Question Link :https://leetcode.com/problems/remove-duplicates-from-sorted-array?envType=study-plan-v2&envId=top-interview-150
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray rd = new RemoveDuplicatesFromSortedArray();
       int[] nums = new int[]{1, 1, 2};
       int[] nums1 = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println("Removed Duplicates From Sorted Array and length of expected array" + " " + rd.removeDuplicates(nums));
        System.out.println("Removed Duplicates From Sorted Array and length of expected array" + " " + rd.removeDuplicates(nums1));
    }
    public int removeDuplicates(int[] nums) {
        int [] k = Arrays.stream(nums).sorted().distinct().toArray();
       System.out.println(Arrays.toString(k));
       return k.length;

    }
}
