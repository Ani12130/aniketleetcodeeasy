
//Question :https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences?envType=problem-list-v2&envId=string
package com.aniket.leetcode.march23rd;
import java.util.HashMap;
import java.util.Map;

public class CountOccurences {
    public static void main(String[] args) {
        boolean result_1 = areOccurrencesEqual("abacbc");
        boolean result_2= areOccurrencesEqual("aaabb");
        System.out.println(result_1);
        System.out.println(result_2);
    }

    public static boolean areOccurrencesEqual(String inputStr) {
        boolean areOccurrencesEqual = false;
        Map<Character, Integer> charfrequency = new HashMap<>();
        for (char ch : inputStr.toCharArray()) {
            charfrequency.put(ch, charfrequency.getOrDefault(ch, 0) + 1);
        }
        System.out.println(charfrequency);
        Integer firstCharFreq = null;
        for (Integer charfreq : charfrequency.values()){
            if(firstCharFreq==null){
                firstCharFreq =charfreq;
            } else if (!charfreq.equals(firstCharFreq)) {
                areOccurrencesEqual=false;
                return areOccurrencesEqual;
            }
        }
        areOccurrencesEqual=true;
        return areOccurrencesEqual;
    }
}





