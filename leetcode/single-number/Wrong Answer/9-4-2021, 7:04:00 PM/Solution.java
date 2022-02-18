// https://leetcode.com/problems/single-number

class Solution {
    public int singleNumber(int[] nums) {
        // For positive ints
        // HashSet<Integer> set = new HashSet<Integer>();
        // int[] index = new int[nums.length];
        // for(int i = 0; i < nums.length; i++){
        //     if(set.contains(nums[i])) index[i]++;
        //     else set.add(nums[i]);
        // }
        // int res = 0;
        // for(int i = 0; i < index.length; i++){
        //     if(index[i] == 1) res = i;
        // }
        if(nums.length == 1) return nums[0];
        HashMap<Integer, Integer> set = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(set.containsValue(nums[i])) set.put(2,nums[i]);
            else set.put(1,nums[i]);
        }
        int res = set.get(1);
        return res;
    }
}