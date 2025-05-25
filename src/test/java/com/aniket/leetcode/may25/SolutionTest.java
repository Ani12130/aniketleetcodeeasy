package com.aniket.leetcode.may25;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Before
    public void setUp() throws Exception {
        Solution solution = new Solution();
    }

    @Test
    public void testStringPrefix() {
        String s = "iloveleetcode";
        String[] words = {"i", "love", "leetcode", "apples"};
        String s2 = "iloveleetcode";
        String[] words2 = { "love", "leetcode", "apples","i"};
       boolean actual1 = Solution.isPrefixString(s,words);
        boolean actual2 = Solution.isPrefixString(s,words2);
        assertEquals(true,actual1);
        assertEquals(false,actual2);

    }
}
