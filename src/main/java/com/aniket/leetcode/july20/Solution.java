    package com.aniket.leetcode.july20;

    public class Solution {
        public static void main(String[] args) {
            Solution s = new Solution();
            System.out.println(s.isPowerOfThree(27));
            System.out.println(s.isPowerOfThree(0));
            System.out.println(s.isPowerOfThree(-1));

        }
        public boolean isPowerOfThree(int n) {
            if (n < 1)
                return false;

            while (n % 3 == 0) {
                n =n/ 3;
            }
            return n == 1;
        }

    }
