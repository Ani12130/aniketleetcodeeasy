package com.aniket.leetcode.aug24;

import java.util.ArrayList;
import java.util.List;

public class SolutionOne {
    public static void main(String[] args) {
        SolutionOne so = new SolutionOne();
        System.out.println("pascals traingle = " + so.generate(5));
        System.out.println("pascals traingle = " + so.generate(1));

    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 1; row <= numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();
            int c = 1;  // first element in each row is 1

            for (int i = 1; i <= row; i++) {
                currentRow.add(c);
                c = c * (row - i) / i;  // compute next binomial coefficient
            }

            triangle.add(currentRow);
        }

        return triangle;
    }
}

