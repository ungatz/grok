// https://leetcode.com/problems/subarray-sum-equals-k

class Solution {
    public int subarraySum(int[] nums, int k) {
        if(k == 0) return 0;
        int start = 0;
        int end = 0;
        int count = 0;
        int sum = 0;
        while(end < nums.length){
            sum += nums[end];
            if(sum < k) end++;
            if(sum > k){
                while(sum > k){
                    sum -= nums[start];
                    start++;
                }
            }
            if(sum == k) {
                count++;
                end++;
            }
        }
        return count;
    }
}