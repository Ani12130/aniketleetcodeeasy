package com.aniket.leetcode.april13th;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
//Question Link : https://leetcode.com/problems/valid-palindrome?envType=study-plan-v2&envId=top-interview-150
public class ValidPalindromeTest {
    ValidPalindrome vd = new ValidPalindrome();

    @Test
    public void validPalindromeTest() {
     assertEquals(true,vd.isPalindrome("A man, a plan, a canal: Panama"));
     assertEquals(false,vd.isPalindrome("race a car"));
     assertEquals(true,vd.isPalindrome(""));
    }
}
