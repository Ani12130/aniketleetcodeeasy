package com.aniket.leetcode.april06;
//QuestionLink:https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string?envType=problem-list-v2&envId=string
public class FirstOcurrence {
    public static void main(String[] args) {
      FirstOcurrence fo = new FirstOcurrence();
      fo.firstoccur("sadbutsad","sad");
      fo.firstoccur("leetcode","leeto");
    }

    public int firstoccur(String haystack, String needle) {
        int result = haystack.indexOf(needle);
        if (result == -1) {
            System.out.println("String is absent:" +":" + result);
        } else {
            System.out.println("String is present:"+":"+ result);
        }
        return result;
    }
}


