// https://leetcode.com/problems/move-zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        for(int j = 0, i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int t = nums[j];
                nums[j] = nums[i];
                nums[i] = t;
                j++;
            }
        }
    }
}