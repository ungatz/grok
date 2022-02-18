// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int max = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i+1; j < prices.length; j++){
                profit = prices[j] - prices[i];
                if(profit > max) max = profit;
            }
        }
        return max;
    }
}