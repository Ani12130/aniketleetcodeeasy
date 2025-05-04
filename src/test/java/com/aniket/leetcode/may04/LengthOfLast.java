package com.aniket.leetcode.may04;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LengthOfLast {

    @Before
    public void setUp() throws Exception {
        LengthOfLast lengthOfLast = new LengthOfLast();
    }

    @Test
        public void testLengthOfLastWord_NormalCases() {
            assertEquals(5, LengthOfLast.lengthOfLastWord("Hello World"));
            assertEquals(2, LengthOfLast.lengthOfLastWord("   fly me   to   the moon  "));
            assertEquals(6, LengthOfLast.lengthOfLastWord("luffy is still joyboy"));
        }

        @Test
        public void testLengthOfLastWord_EmptyString() {
            assertEquals(0, LengthOfLast.lengthOfLastWord(""));
        }

        @Test
        public void testLengthOfLastWord_OnlySpaces() {
            assertEquals(0, LengthOfLast.lengthOfLastWord("     "));
        }

        @Test
        public void testLengthOfLastWord_SingleWord() {
            assertEquals(4, LengthOfLast.lengthOfLastWord("Test"));
            assertEquals(1, LengthOfLast.lengthOfLastWord("A"));
        }

        @Test
        public void testLengthOfLastWord_TrailingSpaces() {
            assertEquals(5, LengthOfLast.lengthOfLastWord("Hello World    "));
            assertEquals(2, LengthOfLast.lengthOfLastWord("   fly   "));
        }
    }
