    package com.aniket.leetcode.july27;

    import java.util.HashMap;
    import java.util.Map;

    public class Solution {
        public static void main(String[] args) {
            Solution s = new Solution();
           System.out.println(s.canConstruct("a","b"));
           System.out.println( s.canConstruct("aa","ab"));
           System.out.println( s.canConstruct("aa","aab"));

        }
        public boolean canConstruct(String ransomNote, String magazine) {
            Map<Character, Integer> freqMap = new HashMap<>();
            for (char c : magazine.toCharArray()) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }
            System.out.println("magazine frequency map before checking against ransom note" + freqMap);

            for (char c : ransomNote.toCharArray()) {
                if (!freqMap.containsKey(c) || freqMap.get(c) == 0) {
                    return false;
                }
                freqMap.put(c, freqMap.get(c) - 1);
            }

            return true;
        }
    }
