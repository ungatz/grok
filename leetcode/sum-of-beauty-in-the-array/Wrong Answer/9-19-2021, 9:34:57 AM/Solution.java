// https://leetcode.com/problems/sum-of-beauty-in-the-array

class Solution {
    public int sumOfBeauties(int[] nums) {
        int beauty = 0;
        int sum = 0;
        for(int i = 1; i < nums.length-1; i++){
            int j = i-1;
            for(int k = i+1; k < nums.length; k++){
                if(nums[j] < nums[i] && nums[i] < nums[k]) sum += 2;
                else if(nums[i-1] < nums[i] && nums[i] < nums[i+1]) sum += 1;
            }
        }
        return sum;
    }
}