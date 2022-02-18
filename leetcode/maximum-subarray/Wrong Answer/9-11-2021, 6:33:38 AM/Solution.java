// https://leetcode.com/problems/maximum-subarray

class Solution {
    public int maxSubArray(int[] nums) {
        int mx = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum < 0) sum = 0;
            if(sum > mx) mx = sum;
        }
         return mx;
    }
}