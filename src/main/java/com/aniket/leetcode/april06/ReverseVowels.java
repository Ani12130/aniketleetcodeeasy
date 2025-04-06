package com.aniket.leetcode.april06;

import java.util.*;
import java.util.stream.Collectors;
//Question Link : https://leetcode.com/problems/reverse-vowels-of-a-string
public class ReverseVowels {
    public static String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        List<Character> reversedVowels = s.chars()
                .mapToObj(c -> (char) c)
                .filter(vowels::contains)
                .collect(Collectors.toList());
        Collections.reverse(reversedVowels);
        System.out.println(reversedVowels.toString());
        StringBuilder result = new StringBuilder();
        int vowelIndex = 0;
        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                result.append(reversedVowels.get(vowelIndex));
                vowelIndex++;
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println("reversed vowels" + " "+ reverseVowels("IceCreAm"));
        System.out.println("reversed vowels" + " "+ reverseVowels("leetcode"));
    }
}
