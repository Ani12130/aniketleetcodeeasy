package com.aniket.leetcode.may25;
//Question Link : https://leetcode.com/problems/delete-characters-to-make-fancy-string?envType=problem-list-v2&envId=string
public class FancyString {

    public String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            // Check the length of the result and the last two characters
            int len = result.length();
            if (len >= 2 && result.charAt(len - 1) == c && result.charAt(len - 2) == c) {
                // Skip the current character if it would create three consecutive characters
                continue;
            }
            // Append the current character to the result
            result.append(c);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        FancyString fancyString = new FancyString();

        String output = fancyString.makeFancyString("aaabaaaa");
        String output_1 = fancyString.makeFancyString( "aab");
         String output_2 = fancyString.makeFancyString( "leeeetcode");

        System.out.println("Final fancy string: " + output);
        System.out.println("Final fancy string: " + output_1);
        System.out.println("Final fancy string: " + output_2);
    }
}

