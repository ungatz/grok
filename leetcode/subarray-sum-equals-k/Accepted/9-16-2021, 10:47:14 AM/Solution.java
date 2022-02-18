// https://leetcode.com/problems/subarray-sum-equals-k

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Sum 0 occurence 1
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum - k)) count += map.get(sum-k);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
        // Variable Sliding Window but works only for positive numbers.
        // while(end < nums.length){
        //     sum += nums[end];
        //     if(sum < k) end++;
        //     if(sum > k){
        //         while(sum > k){
        //             sum -= nums[start];
        //             start++;
        //         }
        //     }
        //     if(sum == k) {
        //         count++;
        //         end++;
        //     }
        // }
        // return count;
    }
}