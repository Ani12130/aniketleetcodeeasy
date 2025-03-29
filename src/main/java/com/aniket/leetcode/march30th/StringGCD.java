package com.aniket.leetcode.march30th;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//Question Link :https://leetcode.com/problems/greatest-common-divisor-of-strings?envType=study-plan-v2&envId=leetcode-75
public class StringGCD {
    private static final Logger logger = LoggerFactory.getLogger(StringGCD.class);

    public static void main(String[] args) {
        logger.info("GCD of given strings:" + "-" + gcdOfStrings("ABCABC", "ABC"));
        logger.info("GCD of given strings:" + "-" + gcdOfStrings("LEET", "CODE"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
         return " ";
        }
        //find gcd of length of strings
        int gcdLength = gcd(str1.length(), str2.length());

        // Return the substring of str1 from 0 to gcdLength
        return str1.substring(0, gcdLength);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }
}



