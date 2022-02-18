// https://leetcode.com/problems/move-zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        for(int lastNZ = 0, cur = 0; cur < nums.length; cur++){
            if(nums[cur] != 0) {
                nums[lastNZ++] = nums[cur];
                nums[cur] = 0;
            }
        }
    }
}