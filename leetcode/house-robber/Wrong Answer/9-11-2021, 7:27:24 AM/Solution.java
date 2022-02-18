// https://leetcode.com/problems/house-robber

class Solution {
    public int rob(int[] nums) {
        int i = 0;
        int j = 1;
        int s1 = 0;
        int s2 = 0;
        while(i < nums.length){
            s1 += nums[i];
            i += 2;
        }
        while(j < nums.length){
            s2 += nums[j];
            j += 2;
        }
        return Math.max(s1,s2);
    }
}