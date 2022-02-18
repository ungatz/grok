// https://leetcode.com/problems/climbing-stairs

class Solution {
    int[] dp = new int[45];
    public int climbStairs(int n) {
        if(dp[n] != 0) return dp[n];
        if(n == 0) return dp[n] = 0;
        if(n == 1) return dp[n] = 1;
        if(n == 2) return dp[n] = 2;
        return dp[n] = climbStairs(n-1) + climbStairs(n-2);
    }
}