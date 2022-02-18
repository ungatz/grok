// https://leetcode.com/problems/partition-equal-subset-sum

class Solution {
    public boolean canPartition(int[] nums) {
         int sum = 0;
        for(int i: nums){
            sum += i;
        }
        if(sum%2 != 0) return false;
        int num = sum/2;
        boolean[][] dp = new boolean[nums.length+1][num+1];
        for(int i=0; i<=nums.length;i++){
            dp[i][0] = true;
        }
        for(int j=1; j<=num; j++){
            dp[0][j] = false;
        }
        for(int i=1; i<=nums.length; i++){
            for(int j=1; j<=num; j++){
                if(j-nums[i-1] >= 0)
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
                else 
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[nums.length][num];
    }
    }
