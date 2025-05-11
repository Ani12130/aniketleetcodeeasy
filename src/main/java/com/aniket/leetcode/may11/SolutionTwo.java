package com.aniket.leetcode.may11;
//QuestionLink :https://leetcode.com/problems/best-time-to-buy-and-sell-stock?envType=problem-list-v2&envId=array
public class SolutionTwo {
            public int maxProfit(int[] prices) {
            int minPrice = Integer.MAX_VALUE;  // Initialize minPrice to the maximum possible integer value
            int maxProfit = 0;                 // Initialize maxProfit to 0

            for (int price : prices) {
                if (price < minPrice) {
                    minPrice = price;          // Update minPrice if a lower price is found
                } else {
                    int profit = price - minPrice;  // Calculate potential profit
                    if (profit > maxProfit) {
                        maxProfit = profit;   // Update maxProfit if current profit is greater
                    }
                }
            }

            return maxProfit;  // Return the maximum profit found
        }

        public static void main(String[] args) {
            SolutionTwo sol = new SolutionTwo();

            int[] prices1 = {7, 1, 5, 3, 6, 4};
            System.out.println(sol.maxProfit(prices1)); // Output: 5

            int[] prices2 = {7, 6, 4, 3, 1};
            System.out.println(sol.maxProfit(prices2)); // Output: 0
        }
    }

