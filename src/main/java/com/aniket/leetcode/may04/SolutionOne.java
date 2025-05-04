package com.aniket.leetcode.may04;
//Question Link : https://leetcode.com/problems/add-binary
public class SolutionOne {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int total = carry;
            if (i >= 0) {
                total += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                total += b.charAt(j) - '0';
                j--;
            }

            carry = total / 2;
            result.append(total % 2);
        }

        // Reverse the string builder to form the proper binary sum
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        SolutionOne so = new SolutionOne();
        System.out.println("add result" +":" + so.addBinary("11","1"));
        System.out.println("add result" +":" + so.addBinary("1010","1011"));

    }
}
