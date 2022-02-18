// https://leetcode.com/problems/sum-of-beauty-in-the-array

class Solution {
    public int sumOfBeauties(int[] nums) {
        int i = 1;
        int j = 0;
        int k = i+1;
        int sum = 0;
        boolean isTwo = false;
        while(i <= nums.length-2 && j < i && k <= nums.length - 1){
            if(nums[i] < nums[k] && nums[j] < nums[i]) {
                isTwo = true;
            } else {
                isTwo = false;
            }
            i++;
            j++;
            k++;
        }
        if(isTwo) sum += 2;
        if(sum == 0){
            for(int p = 1; p < nums.length-2; p++){
                if(nums[p-1] < nums[p] && nums[p] < nums[p+1]) sum += 1;
            }
        }
        return sum;
    }
}