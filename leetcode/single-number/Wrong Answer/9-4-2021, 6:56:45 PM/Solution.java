// https://leetcode.com/problems/single-number

class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int[] index = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])) index[i]++;
            else set.add(nums[i]);
        }
        int res = 0;
        for(int i = 0; i < index.length; i++){
            if(index[i] == 1) res = i;
        }
        if(nums.length == 1) return nums[0];
        else return res;
    }
}