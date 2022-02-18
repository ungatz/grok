// https://leetcode.com/problems/house-robber

class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[101];
        return robFrom(0, nums, dp);
    }
    public int robFrom(int pos, int[] nums, int[] dp){ 
        // this function return the max profit we
        // can bag from index pos to end of the array.
    
        if(pos >= nums.length) return 0;
        
        if(dp[pos] != 0) return dp[pos];
        
        // we can either rob the current house OR
        // we can skip it and move to next house.
        return dp[pos] = Math.max(robFrom(pos+1,nums,dp),
                        nums[pos]+robFrom(pos+2,nums,dp));
    }
}