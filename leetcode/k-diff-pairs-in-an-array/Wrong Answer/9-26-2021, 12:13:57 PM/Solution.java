// https://leetcode.com/problems/k-diff-pairs-in-an-array

class Solution {
    public int findPairs(int[] n, int k) {
        Arrays.sort(n);
        int l = 0, r = 1; 
        int count = 0;
        while(l < n.length && r < n.length){
            if(l == r || Math.abs(n[l] - n[r]) < k) r++;
            else if(Math.abs(n[l] - n[r]) > k) r++;
            else if(Math.abs(n[l] - n[r]) == k) {
                count++;
                l++;
                r++;
                while(l < n.length && n[l] == n[l-1]) l++;
            }
        }
        return count;
    }
}