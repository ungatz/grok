// https://leetcode.com/problems/maximum-product-subarray

class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 0) return 0;
        int prod = 1;
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                prod *= nums[j];
                if(prod > mx) 
                    mx = prod;
            }
            prod = 1;
        }
        return mx;
    }
}