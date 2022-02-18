// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
         if(prices.length == 1) return 0;
        /* ArrayList<Integer> diff = new ArrayList<>();
         for(int i = 0; i < prices.length; i++){
             for(int j = i+1; j <= prices.length-1; j++){
                diff.add(prices[j] - prices[i]);
            }
        }
        Collections.sort(diff);
        int profit = diff.get(diff.size()-1);
        if(profit < 0) return 0;
        return diff.get(diff.size()-1);
        Goddamn TLE */
        
        /* What we are actually doing is this: for every                element, we are calculating the difference between              that element and the minimum of all the values before          that element and we are updating the maximum profit if          the difference thus found is greater than the current          maximum profit. */
        int min_profit = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min_profit) 
                min_profit = prices[i];
            else if (prices[i] - min_profit > max_profit)
                max_profit = prices[i] - min_profit;
        }
        return max_profit;
    }
}