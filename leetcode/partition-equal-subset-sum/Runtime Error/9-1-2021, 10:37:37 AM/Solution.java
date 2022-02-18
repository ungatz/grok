// https://leetcode.com/problems/partition-equal-subset-sum

class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        } 
        if(sum%2 != 0) return false;
        else return subSetSum(nums,sum/2,nums.length-1);
    }
    public boolean subSetSum(int[] a, int sum, int n){
        if(sum == 0 && n != 0) return true;
        if(sum != 0 && n == 0) return false;
        if(a[n-1] > sum) return subSetSum(a,sum,n-1);
        else return subSetSum(a,sum-a[n-1],n-1) || subSetSum(a,sum,n-1);
    }
}