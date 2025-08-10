package com.aniket.leetcode.aug10;

import java.util.Arrays;
//Question : https://leetcode.com/problems/plus-one/description/
public class SolutionOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry needed
            }
            digits[i] = 0; // Carry over
        }

        // If all digits were 9, we need an extra digit at the front for eg {9,9,9}
        int[] output = new int[n + 1];
        output[0] = 1;
        return output;
    }

    public static void main(String[] args) {
        SolutionOne so = new SolutionOne();
        System.out.println("output: " + Arrays.toString(so.plusOne(new int[]{1, 2, 3}))); // [1, 2, 4]
        System.out.println("output: " + Arrays.toString(so.plusOne(new int[]{4, 3, 2, 1}))); // [4, 3, 2, 2]
        System.out.println("output: " + Arrays.toString(so.plusOne(new int[]{9})));
    }
}