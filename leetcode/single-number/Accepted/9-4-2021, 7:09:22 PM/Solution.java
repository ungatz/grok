// https://leetcode.com/problems/single-number

class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int[] index = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])) set.remove(nums[i]);
            else set.add(nums[i]);
        }
        return (int) set.iterator().next();
    }
}