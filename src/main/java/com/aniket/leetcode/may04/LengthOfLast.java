package com.aniket.leetcode.may04;

public class LengthOfLast {
    public static int lengthOfLastWord(String s) {
        int len = 0;

        s = s.strip();

        for(int i = s.length()-1; i >= 0 && s.charAt(i) != ' '; i--){
            len++;
        }

        return len;
    }

    public static void main(String[] args) {
        LengthOfLast sl = new LengthOfLast();
        System.out.println("Length of last word" + ":"+ LengthOfLast.lengthOfLastWord("Hello World"));
        System.out.println("Length of last word" + ":"+LengthOfLast.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println("Length of last word" + ":"+ LengthOfLast.lengthOfLastWord( "luffy is still joyboy"));
    }
}
