package com.aniket.leetcode.may11;

import org.junit.Test;

import static com.aniket.leetcode.may11.SolutionOne.countFullyTypableWords;
import static org.junit.Assert.assertEquals;
//QuestionLink : https://leetcode.com/problems/maximum-number-of-words-you-can-type?envType=problem-list-v2&envId=string
public class SolutionOneTest {
    SolutionOne so = new SolutionOne();

    @Test
    public void canTypeTest() {
        assertEquals(1,countFullyTypableWords("hello world", "ad"));
        assertEquals(1,countFullyTypableWords("leet code", "lt"));
        assertEquals(0,countFullyTypableWords("leet code", "e"));

    }
}
