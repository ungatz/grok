// https://leetcode.com/problems/rotate-array

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        ArrayList<Integer> newNums = new ArrayList<Integer>();
        int i = n - k;
        for(int j = i; j < n; j++){
            newNums.add(nums[j]);
        }
        for(int j = 0; j < i; j++){
            newNums.add(nums[j]);
        }
        for(i = 0; i < newNums.size(); i++){
            nums[i] = newNums.get(i);
        }
    }
}