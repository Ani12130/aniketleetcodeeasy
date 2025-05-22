package com.aniket.leetcode.may18;

import java.util.HashSet;
import java.util.Set;

//Question Link :https://leetcode.com/problems/happy-number?envType=study-plan-v2&envId=top-interview-150
public class SolutionOne {

        public boolean isHappy(int n) {
            Set<Integer> seenNumbers = new HashSet<>();

            while (n != 1 && !seenNumbers.contains(n)) {
                seenNumbers.add(n);
                n = getNext(n);
            }

            return n == 1;
        }

        private int getNext(int n) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            return sum;
        }

        public static void main(String[] args) {
            SolutionOne happyNumber = new SolutionOne();

            // Example usage
            int n = 2; // Change this value to test other numbers
            boolean result = happyNumber.isHappy(n);

            System.out.println(n + " is a happy number?: " + result);
        }
    }


