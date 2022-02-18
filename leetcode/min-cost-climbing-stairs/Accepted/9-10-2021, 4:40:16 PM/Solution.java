// https://leetcode.com/problems/min-cost-climbing-stairs

class Solution {
    static int minSum = 0;
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        return minCost(cost.length, cost, dp);
    }
    public int minCost(int i, int[] cost, int[] dp){ //minimumCost(i) will represent the minimum cost to                                    // reach the ith step.
        if(i == 0 || i == 1) return dp[i] = 0; //since we are allowed to start on either step 0 or step 1
        if(dp[i] != 0) return dp[i];
        return dp[i] = Math.min(minCost(i-1,cost,dp)+cost[i-1],minCost(i-2,cost,dp)+cost[i-2]);
    }
}