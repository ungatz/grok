// https://leetcode.com/problems/house-robber-ii

class Solution {
    public int rob(int[] nums) {
        return Math.max(robFrom1(0, nums), robFrom2(1, nums));
    }
    public int robFrom1(int pos, int[] nums){
        if(pos >= nums.length-1) return 0;
        return Math.max(robFrom1(pos+1,nums),nums[pos]+robFrom1(pos+2,nums));
    }
    public int robFrom2(int pos, int[] nums){
        if(pos >= nums.length) return 0;
        return Math.max(robFrom2(pos+1,nums),nums[pos]+robFrom2(pos+2,nums));
    }
}