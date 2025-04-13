package com.aniket.leetcode.april13th;
//Question Link : https://leetcode.com/problems/valid-palindrome?envType=study-plan-v2&envId=top-interview-150
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[: ,]","");
        String cleanedlc=cleaned.toLowerCase();
        String reversed = new StringBuilder(cleanedlc).reverse().toString();
       System.out.println(reversed);
        return cleanedlc.equals(reversed);
    }
    public static void main(String[] args) {
        ValidPalindrome vd = new ValidPalindrome();
        System.out.println("is Valid Palindrome" + " " + vd.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("is Valid Palindrome" + " " + vd.isPalindrome("race a car"));
        System.out.println("is Valid Palindrome" +"  " + vd.isPalindrome(""));
    }
}
