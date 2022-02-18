// https://leetcode.com/problems/house-robber

class Solution {
    
    private int[] memo = new int[101];
    
    public int rob(int[] nums) {
        return this.robFrom(0, nums);
    }
    
    private int robFrom(int i, int[] nums) {
        
        // No more houses left to examine.
        if (i >= nums.length) {
            return 0;
        }
        
        // Return cached value.
        if (this.memo[i] != 0) {
            return this.memo[i];
        }
        
        // Recursive relation evaluation to get the optimal answer.
        int ans = Math.max(this.robFrom(i + 1, nums), this.robFrom(i + 2, nums) + nums[i]);
        
        // Cache for future use.
        this.memo[i] = ans;
        return ans;
    }
}