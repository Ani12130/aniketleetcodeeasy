package com.aniket.leetcode.may04;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LengthOfLastTest {
        LengthOfLast sl = new LengthOfLast();


    @Test
        public void testLengthOfLastWord_NormalCases() {
        assertEquals(5,sl.lengthOfLastWord("Hello World"));
        assertEquals(4,sl.lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6,sl.lengthOfLastWord("luffy is still joyboy"));
        }

        @Test
        public void testLengthOfLastWord_EmptyString() {
            assertEquals(0, sl.lengthOfLastWord("  "));
        }
        @Test
        public void testLengthOfLastWord_SingleWord() {
            assertEquals(4, sl.lengthOfLastWord("Test"));
            assertEquals(1, sl.lengthOfLastWord("A"));
        }

        @Test
        public void testLengthOfLastWord_TrailingSpaces() {
            assertEquals(5, sl.lengthOfLastWord("Hello World    "));
            assertEquals(3, sl.lengthOfLastWord("   fly   "));
        }
    }
