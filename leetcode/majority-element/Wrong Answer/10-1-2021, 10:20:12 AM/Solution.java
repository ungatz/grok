// https://leetcode.com/problems/majority-element

class Solution {
    public int majorityElement(int[] nums) {
        double times = Math.floor(nums.length/2);
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])) map.put(nums[i], i);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) > times) res = nums[i];
        }
        return res;
    }
}