// https://leetcode.com/problems/increasing-triplet-subsequence

class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length == 0) return false;
        int i = 0;
        int j = 1;
        while(i < nums.length && j < nums.length-1){
            if(nums[i] < nums[j] && nums[j] < nums[j+1]){
                return true;
            }
            i++;
            j++;
        }
        return false;
    }
}