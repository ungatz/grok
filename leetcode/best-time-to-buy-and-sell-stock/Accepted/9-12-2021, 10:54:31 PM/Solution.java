// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
        int mx = 0;
        int mi = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < mi) mi = prices[i];
            else if(prices[i] - mi > mx) mx = prices[i] - mi;
        }
        return mx;
    }
}