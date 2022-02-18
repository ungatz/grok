// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] p) {
        // O(n^2)
        // int profit = 0;
        // int max = 0;
        // for(int i = 0; i < prices.length-1; i++){
        //     for(int j = i+1; j < prices.length; j++){
        //         profit = prices[j] - prices[i];
        //         if(profit > max) max = profit;
        //     }
        // }
        // return max;
        
        // O(n)
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0; i < p.length; i++){
            if(p[i] < minPrice) minPrice = p[i];
            else if(p[i] - minPrice > maxProfit) maxProfit = p[i] - minPrice;                                 
        }
        return maxProfit;
    }
}