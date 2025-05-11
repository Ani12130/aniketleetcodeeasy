package com.aniket.leetcode.may04;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

//Question Link : https://leetcode.com/problems/add-binary
public class SolutionOneTest {



    SolutionOne  so = new SolutionOne();


    @Test
    public void testaddBinary() {
        String actual= so.addBinary("1","11");
        String actual1= so.addBinary("1010","1011");
        assertEquals("100",actual);
        assertEquals("10101",actual1);
    }
}
