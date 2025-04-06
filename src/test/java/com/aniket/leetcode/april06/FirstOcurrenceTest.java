package com.aniket.leetcode.april06;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//QuestionLink:https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string?envType=problem-list-v2&envId=string
public class FirstOcurrenceTest {

    FirstOcurrence fw= new FirstOcurrence();

    @Test
    public void testFirstOccurenceS1() {
      int actual = fw.firstoccur("sadbutsad","sad");
      assertEquals(0,actual);
    }
    @Test
    public void testFirstOccurenceS2() {
        int actual = fw.firstoccur("leetcode","leeto");
        assertEquals(-1,actual);
    }
}


