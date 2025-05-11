package com.aniket.leetcode.may11;

import java.util.HashSet;
import java.util.Set;

public class SolutionOne {

        public static int countFullyTypableWords(String text, String brokenLetters) {
            // Convert broken letters into a HashSet for quick lookup
            Set<Character> brokenSet = new HashSet<>();
            for (char ch : brokenLetters.toCharArray()) {
                brokenSet.add(ch);
            }

            // Split the text into words
            String[] words = text.split(" ");
            int count = 0;

            // Check each word
            for (String word : words) {
                boolean canType = true;
                for (char ch : word.toCharArray()) {
                    if (brokenSet.contains(ch)) {
                        canType = false;
                        break;
                    }
                }
                if (canType) {
                    count++;
                }
            }

            return count;
        }

        public static void main(String[] args) {
            // Test cases
            System.out.println(countFullyTypableWords("hello world", "ad")); // Output: 1
            System.out.println(countFullyTypableWords("leet code", "lt"));   // Output: 1
            System.out.println(countFullyTypableWords("leet code", "e"));    // Output: 0
        }
    }

