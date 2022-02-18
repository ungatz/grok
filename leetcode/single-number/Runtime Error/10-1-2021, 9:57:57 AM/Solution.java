// https://leetcode.com/problems/single-number

class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] a = new int[30000];
        for(int i = 0; i < nums.length; i++){
            if(a[nums[i]] == 0) a[nums[i]] = 1;
            else a[nums[i]]++;
        }
        int result = 0;
        for(int i = 0; i < 30000; i++){
            if(a[i] == 1) result = i;
        }
        return result;
    }
}