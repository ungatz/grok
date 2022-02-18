// https://leetcode.com/problems/majority-element

class Solution {
    public int majorityElement(int[] nums) {
        // double times = Math.floor(nums.length/2);
        // Map<Integer, Integer> map = new HashMap<>();
        // int res = 0;
        // for(int i = 0; i < nums.length; i++) map.put(nums[i],map.getOrDefault(nums[i], 0) + 1;
        // for(int i = 0; i < nums.length; i++){
        //     if(map.get(nums[i]) > times) res = nums[i];
        // }
        // return res;
        int count = 0;
        int candidate = 0;
        for(int num: nums){
            if(count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}