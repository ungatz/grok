// https://leetcode.com/problems/maximum-subarray

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        int mx = nums[0];
        int sum = nums[0];
        int counter = 0;
        while(counter < nums.length){
            sum = Math.max(nums[counter], sum+nums[counter]);
            mx = Math.max(mx, sum);
            counter++;
        }
        return mx;
    }
}