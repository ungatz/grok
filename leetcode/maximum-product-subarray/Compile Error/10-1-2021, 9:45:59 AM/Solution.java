// https://leetcode.com/problems/maximum-product-subarray

class Solution {
    public int maxProduct(int[] nums) {
        int mxProduct = nums[0];
        int minProduct = nums[0]; // to handle -ve values
        int result = mxProduct;
        for(int i =1; i < nums; i++){
            int cur = nums[i];
            int mx = Math.max(cur, Math.max(mxProduct*cur, minProduct*cur));
            minProduct = Math.min(cur, Math.min(mxProduct*cur, minProduct*cur));
            mxProduct = mx;
            result = Math.max(result, mxProduct);
        }
        return result;
    }
}