// https://leetcode.com/problems/product-of-array-except-self

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = product(nums, i);
        }
        return ans;
    }
    private static int product(int[] nums, int idx){
        int[] nums_t = nums.clone();
        nums_t[idx] = 1;
        int prod = 1;
        for(int i = 0; i < nums_t.length; i++){
            prod *= nums_t[i];
        }
        return prod;
    }
}