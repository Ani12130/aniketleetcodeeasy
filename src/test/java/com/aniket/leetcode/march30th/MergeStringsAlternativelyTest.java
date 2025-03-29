package com.aniket.leetcode.march30th;
import org.junit.Before;
import org.junit.Test;

import static com.aniket.leetcode.march30th.MergeStringsAlternatively.mergeAlternately;
import static org.junit.Assert.assertEquals;

//Question Link : https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
public class MergeStringsAlternativelyTest {
    @Before
    public void setUp() throws Exception {
        MergeStringsAlternatively mergeStringsAlternatively = new MergeStringsAlternatively();
    }

    @Test
    public void testMergeAlternately() {
        assertEquals("apbqcr",mergeAlternately("abc","pqr"));
        assertEquals("apbqrs",mergeAlternately("ab","pqrs"));
        assertEquals("apbqcd",mergeAlternately("abcd","pq"));
    }
    }


