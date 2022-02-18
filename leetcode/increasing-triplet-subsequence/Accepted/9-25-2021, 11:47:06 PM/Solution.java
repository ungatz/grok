// https://leetcode.com/problems/increasing-triplet-subsequence

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int firstSmall = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= firstSmall) firstSmall = nums[i];
            else if(nums[i] <= secondSmall) secondSmall = nums[i];
            else if(nums[i] > firstSmall && nums[i] > secondSmall) return true;
        }
        
        return false;
    }
}

// if i,j,k are consecutive
// if(nums.length == 0) return false;
        // int i = 0;
        // int j = 1;
        // while(i < nums.length && j < nums.length-1){
        //     if(nums[i] < nums[j] && nums[j] < nums[j+1]){
        //         return true;
        //     }
        //     i++;
        //     j++;
        // }
        // return false;