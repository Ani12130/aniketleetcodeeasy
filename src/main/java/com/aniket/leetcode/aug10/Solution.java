package com.aniket.leetcode.aug10;
//Question : https://leetcode.com/problems/is-subsequence/
class Solution {
    public  boolean isSubsequence(String s1, String s2) {
        int i = 0, j = 0;

        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s1.length();
    }

    public static void main(String[] args) {
        Solution so = new Solution();
        System.out.println(so.isSubsequence("abc", "ahbgdc"));
        System.out.println(so.isSubsequence("axc", "ahbgdc"));
    }
}
