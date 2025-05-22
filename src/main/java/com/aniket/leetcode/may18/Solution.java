package com.aniket.leetcode.may18;

import java.util.Arrays;
import java.util.stream.IntStream;
//QuestionLink :https://leetcode.com/problems/merge-sorted-array?envType=study-plan-v2&envId=top-interview-150
public class Solution {

        public void merge(int[] nums1, int m, int[] nums2, int n) {
            // Use Java streams to merge and sort the two arrays
            int[] merged = IntStream.concat(
                            Arrays.stream(nums1, 0, m),
                            Arrays.stream(nums2, 0, n)
                    )
                    .sorted()
                    .toArray();

            // Copy the sorted merged array back to nums1
            System.arraycopy(merged, 0, nums1, 0, m + n);
        }

        public static void main(String[] args) {
            Solution merger = new Solution();

            // Example usage
            int[] nums1 = {1, 2, 3, 0, 0, 0}; // nums1 has enough space for nums2
            int m = 3; // Number of valid elements in nums1
            int[] nums2 = {2, 5, 6}; // nums2
            int n = 3; // Number of valid elements in nums2

            merger.merge(nums1, m, nums2, n);

            // Print the merged array
            System.out.println(Arrays.toString(nums1));
        }
    }


