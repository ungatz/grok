// https://leetcode.com/problems/house-robber-ii

class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        
        int mx1 = robFrom(nums, 0, nums.length - 2);
        int mx2 = robFrom(nums, 1, nums.length -1);
        
        return Math.max(mx1, mx2);
    }
    public int robFrom(int[] nums, int start, int end){
        int t1 = 0, t2 = 0;
        int cur = 0;
        for(int i = start; i <= end; i++){
            int temp = t1;
            cur = nums[i];
            t1 = Math.max(cur+t2, t1);
            t2 = temp;
        }
        return t1;
    }
}