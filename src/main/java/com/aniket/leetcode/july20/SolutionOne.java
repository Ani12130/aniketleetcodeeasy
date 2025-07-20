package com.aniket.leetcode.july20;

import java.util.HashMap;
import java.util.Map;

public class SolutionOne {
    public static void main(String[] args) {
     SolutionOne so = new SolutionOne();
     System.out.println(so.wordPattern("abba","dog cat cat dog"));
     System.out.println(so.wordPattern("aaaa","dog cat cat dog"));
    }
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false; // Early check for length mismatch
        }

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            // Check char-to-word mapping
            if (charToWord.containsKey(ch)) {
                if (!charToWord.get(ch).equals(word)) {
                    return false;
                }
            } else {
                charToWord.put(ch, word);
            }

            // Check word-to-char mapping
            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != ch) {
                    return false;
                }
            } else {
                wordToChar.put(word, ch);
            }
        }

        return true;
    }
}
