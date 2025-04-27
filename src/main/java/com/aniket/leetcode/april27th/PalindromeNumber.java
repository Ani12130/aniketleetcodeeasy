package com.aniket.leetcode.april27th;
//Question Link : https://leetcode.com/problems/palindrome-number
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("is palindrome ?" + " " + isPalindrome(302));
    }

    public static boolean isPalindrome(int number) {
        // Negative numbers are not palindromes
        if (number < 0) {
            return false;
        }

        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number mathematically
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            number = number / 10; // Remove the last digit
        }
        if (originalNumber == reversedNumber) {
            System.out.println("No is palindrome");
            return true;
        }

        return false;
    }
}
