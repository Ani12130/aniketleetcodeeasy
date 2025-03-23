package com.aniket.leetcode.march23rd;

import java.util.HashMap;
import java.util.Map;
//Question Link : https://leetcode.com/problems/roman-to-integer?envType=problem-list-v2&envId=string
public class ConvertToInt {
    public static void main(String[] args) {
        System.out.println("Converted Roman Number to Int" + " " + romanToInt("III"));
        System.out.println("Converted Roman Number to Int" + " " + romanToInt("LVIII"));
        System.out.println("Converted Roman Number to Int" + " " + romanToInt("MCMXCIV"));

    }

    public static int romanToInt(String s) {
        Map<Character, Integer> rn = new HashMap<>();
        rn.put('I', 1);
        rn.put('V', 5);
        rn.put('X', 10);
        rn.put('L', 50);
        rn.put('C', 100);
        rn.put('D', 500);
        rn.put('M', 1000);
        System.out.println(rn);
        int total = 0;
        int prevValue = 0;

        // Iterate through the Roman numeral string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = rn.get(currentChar);

            // If the current value is less than the previous value, subtract it
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                // Otherwise, add it
                total += currentValue;
            }

            // Update the previous value
            prevValue = currentValue;
        }

        return total;
    }
}

