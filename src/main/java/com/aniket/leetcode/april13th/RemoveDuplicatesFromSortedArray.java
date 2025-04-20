package com.aniket.leetcode.april13th;

import java.util.Arrays;
import java.util.HashMap;

//Question Link :https://leetcode.com/problems/remove-duplicates-from-sorted-array?envType=study-plan-v2&envId=top-interview-150
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray rd = new RemoveDuplicatesFromSortedArray();
       int[] nums = new int[]{1, 1, 2};
       int[] nums1 = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println("Removed Duplicates From Sorted Array and length of expected array" + " " + rd.removeDuplicates(nums));
        System.out.println("Removed Duplicates From Sorted Array and length of expected array" + " " + rd.removeDuplicates(nums1));
        System.out.println("Print Removed Duplicates from nums array");
        printRepeatedIntegers(nums);
        System.out.println("Print Removed Duplicates From nums 1 array");
        printRepeatedIntegers(nums1);

    }
    public int removeDuplicates(int[] nums) {
        int [] k = Arrays.stream(nums).sorted().distinct().toArray();
       System.out.println(Arrays.toString(k));
       return k.length;

    }
    public static void printRepeatedIntegers(int[] array) {
        // Create a HashMap to store the frequency of each integer
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Populate the frequency map
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print integers that appear more than once
        System.out.println("Repeated integers:");
        for (HashMap.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " (Repeated " + entry.getValue() + " times)");
            }
        }
    }
}
