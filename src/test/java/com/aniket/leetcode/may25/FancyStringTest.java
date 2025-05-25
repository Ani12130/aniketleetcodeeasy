package com.aniket.leetcode.may25;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//Question Link : https://leetcode.com/problems/delete-characters-to-make-fancy-string?envType=problem-list-v2&envId=string
public class FancyStringTest {


        FancyString fancyString = new FancyString();


    @Test
    public void testFancyString() {
        assertEquals("aabaab",fancyString.makeFancyString("aaabaaaab"));
        assertEquals("abab",fancyString.makeFancyString("abab"));
        assertEquals("leetcode",fancyString.makeFancyString("leeetcode"));
        assertEquals("ddbdd",fancyString.makeFancyString("dddbddd"));

    }
}

