package com.aniket.leetcode.march23rd;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class CountOccurencesTest {

    CountOccurences countOccurencesTest;

    @Before
    public void setUp() throws Exception {
        countOccurencesTest = new CountOccurences();
    }

         @Test
        public void testAreOccurrencesEqual_WithEqualOccurrences() {
            assertEquals(true, CountOccurences.areOccurrencesEqual("abacbc"));
        }

    @Test
    public void testAreOccurrencesEqual_WithUnEqualOccurrences() {
        assertEquals(false, CountOccurences.areOccurrencesEqual("abbbddc"));
    }
    @Test
    public void testAreOccurrencesEqual_WithZeroOccurrences() {
        assertEquals(true, CountOccurences.areOccurrencesEqual(" "));
    }
    }
