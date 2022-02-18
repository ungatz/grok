// https://leetcode.com/problems/search-in-rotated-sorted-array

class Solution {
    public int getMid(int[] nums) {
        if(nums.length == 1) 
            return nums[0];
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left) / 2;
        
        while(left <= right) {
            if(nums[mid] > nums[mid+1])
                return mid+1;
            if(nums[mid-1] > nums[mid])
                return mid;
            if(nums[mid] > nums[0])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
    public int search(int[] nums, int target){
        if(nums.length == 1 && nums[0] != target)
            return -1;
        if(nums.length == 1 && nums[0] == target)
            return 0;
        int mid = getMid(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            if(nums[mid] > target)
                right = mid - 1;
            if(nums[mid] < target)
                left = mid + 1;
            if(nums[mid] == target) 
                return mid;
            mid = left + (right - left) / 2;
        }
        return -1;
    }
}