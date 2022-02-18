// https://leetcode.com/problems/rotate-array

class Solution {
    public void rotate(int[] nums, int k) {
        // relation between reversing and rotating
        int i = 0;
        int j = nums.length - 1;
        reverse(nums, i, j);
        j = k-1;
        reverse(nums, i, j);
        i = k;
        j = nums.length - 1;
        reverse(nums, i, j);
    }
    public void reverse(int[] a,int i, int j){
        while(i < j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}