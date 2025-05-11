package com.aniket.leetcode.may04;

public class LengthOfLast {
    public int lengthOfLastWord(String s) {
        int len = 0;

        s = s.strip();

        for(int i = s.length()-1; i >= 0 && s.charAt(i) != ' '; i--){
            len++;
        }

        return len;
    }

    public static void main(String[] args) {
        LengthOfLast sl = new LengthOfLast();
        System.out.println("Length of last word" + ":"+ sl.lengthOfLastWord("Hello World"));
        System.out.println("Length of last word" + ":"+sl.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println("Length of last word" + ":"+ sl.lengthOfLastWord( "luffy is still joyboy"));
    }
}
