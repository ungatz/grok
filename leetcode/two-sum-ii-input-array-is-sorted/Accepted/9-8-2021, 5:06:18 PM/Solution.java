// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int j = numbers.length - 1;
        int i = 0;
        while(i < j){
            int sum = numbers[i] + numbers[j];
            if(sum > target) j--;
            else if(sum < target) i++;
            else if(sum == target){
                res[0] = i+1;
                res[1] = j+1;
                return res;
            }
        }
        return new int[] {};
    }
}