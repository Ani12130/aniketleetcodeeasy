package com.aniket.leetcode.april27th;

import java.util.Arrays;
import java.util.HashMap;
//Question Link : https://leetcode.com/problems/two-sum
public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        // Create a HashMap to store the difference and index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        int complement = 0;
        int i=0;
        for (i = 0; i < nums.length; i++) {
            // Calculate the complement of the current number
            complement = target - nums[i];
            // Check if the complement exists in the HashMap
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Return indices
            }

            // Add the current number and its index to the HashMap
            map.put(nums[i], i);
        }
        return new int[]{map.get(complement), i};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15}; // Example array
        int[] nums1 ={3,2,4};
        int [] nums2 ={3,3};

        int target = 9; // Example target

        // Find the indices of the two numbers
        int[] result = findTwoSum(nums, target);
        int target1 =6;
        int[] result1 = findTwoSum(nums1, target1);
        int target2=6;
        int[] result2 = findTwoSum(nums2, target2);
        // Print the result
        System.out.println("Indices: " + Arrays.toString(Arrays.stream(result).toArray()));
        System.out.println("Indices: " + Arrays.toString(Arrays.stream(result1).toArray()));
        System.out.println("Indices: " + Arrays.toString(Arrays.stream(result2).toArray()));
    }
}