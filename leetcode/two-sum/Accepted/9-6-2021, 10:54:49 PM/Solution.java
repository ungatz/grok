// https://leetcode.com/problems/two-sum

class Solution {
    public int[] twoSum(int[] nums, int t) {
        HashMap<Integer,Integer> set = new HashMap<Integer,Integer>();
        int[] a = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(set.containsKey(t-nums[i])) {
                a[0] = set.get(t-nums[i]);
                a[1] = i;
            }
            set.put(nums[i],i);
        }
        return a;
    }
}