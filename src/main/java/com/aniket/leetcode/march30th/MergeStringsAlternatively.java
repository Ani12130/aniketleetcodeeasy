package com.aniket.leetcode.march30th;

import java.util.ArrayList;

//Question Link : https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
public class MergeStringsAlternatively {
            public static void main(String[] args) {
            System.out.println("Merged Alternatively"+ "-" +  mergeAlternately("abc","pqr"));
            System.out.println("Merged Alternatively"+ "-" +  mergeAlternately("ab","pqrs"));
            System.out.println("Merged Alternatively"+ "-" +  mergeAlternately("abcd","pq"));
        }
        public static String mergeAlternately(String word1, String word2) {
            StringBuilder ma = new StringBuilder();
            for(int i = 0; i< word1.length()||i<word2.length(); i++){
                if(i<word1.length()){
                    ma.append(word1.charAt(i));
                }
                if(i<word2.length()){
                    ma.append(word2.charAt(i));
                }
            }
            return ma.toString();
        }
    }


