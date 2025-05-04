package com.aniket.leetcode.may04;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

//Question Link : https://leetcode.com/problems/add-binary
public class SolutionOne {
   SolutionOne so = new SolutionOne();

    @Test
    public void testaddBinary() {
        String actual= so.addBinary();
        String actual1= so.addBinary();
        assertEquals("100",actual);
        assertEquals("10101",actual1);
    }
}
