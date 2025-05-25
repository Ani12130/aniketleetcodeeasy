package com.aniket.leetcode.may25;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s = "iloveleetcode";
        String[] words = {"i", "love", "leetcode", "apples"};
        System.out.println(Solution.isPrefixString(s, words));  // Output: true

        String s2 = "iloveleetcod";
        String[] words2 = {"i", "love", "leetcode", "apples"};
        System.out.println(Solution.isPrefixString(s2, words2)); // Output: false
    }
        public static boolean isPrefixString(String s, String[] words) {
            StringBuilder prefix = new StringBuilder();
            for (String word : words) {
                prefix.append(word);
                if (prefix.toString().equals(s)) {
                    return true;
                }
                // Early stop if prefix is longer than s
                if (prefix.length() > s.length()) {
                    break;
                }
            }
            return false;
        }
    }


