package com.aniket.leetcode.july27;

import java.util.HashMap;
import java.util.Map;

public class SolutionOne {
    public static void main(String[] args) {
        SolutionOne solutionOne = new SolutionOne();
        System.out.println(solutionOne.isAnagram("anagram", "nagaram"));
        System.out.println(solutionOne.isAnagram("rat", "car"));
    }

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> freqMapForS = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMapForS.put(c, freqMapForS.getOrDefault(c, 0) + 1);
        }
        System.out.println("frequency map for s" + freqMapForS);
        Map<Character, Integer> freqMapForT = new HashMap<>();
        for (char c : t.toCharArray()) {
            freqMapForT.put(c, freqMapForT.getOrDefault(c, 0) + 1);
        }
        System.out.println("frequency map for t" + freqMapForT);
        if (!freqMapForT.equals(freqMapForS)) {
            return false;
        }
        return true;
    }
}

