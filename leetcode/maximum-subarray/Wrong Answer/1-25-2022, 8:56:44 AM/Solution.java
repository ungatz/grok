// https://leetcode.com/problems/maximum-subarray

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        int mx = Integer.MIN_VALUE;
        int sum = 0;
        int counter = 0;
        while(counter < nums.length){
            sum += nums[counter];
            if(sum < 0) sum = 0;
            if(sum > mx) mx = sum;
            counter++;
        }
        return mx;
    }
}