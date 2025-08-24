package com.aniket.leetcode.aug24;
//Question Link : https://leetcode.com/problems/search-insert-position/description/?envType=problem-list-v2&envId=array
public class Solution {
    public static void main(String[] args) {
        Solution so = new Solution();
        System.out.println(so.searchInsert(new int[]{1,3,5,6},5));
        System.out.println(so.searchInsert(new int[]{1,3,5,6},2));
        System.out.println(so.searchInsert(new int[]{1,3,5,6},7));
    }
        public int searchInsert(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2; //Prevents potential overflow.
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return left;
        }
    }


