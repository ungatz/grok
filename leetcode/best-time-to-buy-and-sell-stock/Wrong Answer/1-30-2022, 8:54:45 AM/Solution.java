// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
         if(prices.length == 1) return 0;
        // ArrayList<Integer> diff = new ArrayList<>();
        // for(int i = 0; i < prices.length; i++){
        //     for(int j = i+1; j <= prices.length-1; j++){
        //         diff.add(prices[j] - prices[i]);
        //     }
        // }
        // Collections.sort(diff);
        // int profit = diff.get(diff.size()-1);
        // if(profit < 0) return 0;
        // return diff.get(diff.size()-1);
        // Goddamn TLE
        int i = 0;
        int j = prices.length-1;
        int diff = prices[j] - prices[i];
        while(i < j){
            i++;
            j--;
            if(j != 0 && i != prices.length-1)
                diff = Math.max(diff, prices[j] - prices[i]);
        }
        if(diff < 0) return 0;
        return diff;
    }
}