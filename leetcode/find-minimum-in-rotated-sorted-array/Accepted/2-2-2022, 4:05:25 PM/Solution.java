// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array

class Solution {
    public int findMin(int[] nums) {
        // Modified Binary Search
        // As we know that nums is sorted but rotated so we can't use mid point as
        // we do in standard binary search so, we find infliction point
        // such that later element is smaller than current.
        if(nums.length == 1) 
            return nums[0];
        int left = 0;
        int right = nums.length - 1;
        
        if(nums[right] > nums[left]) // Already sorted
            return nums[0];
        
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[mid+1])
                return nums[mid+1];
            if(nums[mid-1] > nums[mid])
                return nums[mid];
            if(nums[mid] > nums[0])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}