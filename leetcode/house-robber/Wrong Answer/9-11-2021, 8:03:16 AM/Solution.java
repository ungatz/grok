// https://leetcode.com/problems/house-robber

class Solution {
    public int rob(int[] nums) {
        int i = 0;
        int j = 1;
        int s1 = 0;
        int s2 = 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        while(i < nums.length){
            s1 += nums[i];
            i += 2;
        }
        while(j < nums.length){
            s2 += nums[j];
            j += 2;
        }
        int s3 = nums[0] + nums[nums.length-1];
        return Math.max(s3,Math.max(s1,s2));
    }
}