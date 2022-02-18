// https://leetcode.com/problems/minimum-size-subarray-sum

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int ws = 0;
        int we = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        for(we = 0; we < nums.length; we++){
            sum += nums[we];
            while(sum >= target){
                ans = Math.min(ans, we+1-ws); // min length window
                sum -= nums[ws++]; // move start of window
            }
        }
        return ans != Integer.MAX_VALUE ? ans : 0;
    }
}