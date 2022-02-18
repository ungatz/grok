// https://leetcode.com/problems/longest-substring-without-repeating-characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Variable Sliding window
        int[] chars = new int[128];
        int left = 0;
        int right = 0;
        int res = 0;
        while(right < s.length()){
            char r = s.charAt(right);
            chars[r]++;
            while(chars[r] > 1){
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }
            res = Math.max(res, right-left+1);
            right++;
        }
        return res;
    }
}

// public int lengthOfLongestSubstring(String s) {
//         // brute force O(n^3)
//         int n = s.length();
//         int res = 0;
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < n; j++){
//                 if(check(s,i,j)) res = Math.max(res, j-i+1); // j-i+1 is length of the current substring which ain't got any repeating chars. 
//             }
//         }
//         return res;
//     }
//     private boolean check(String s, int start, int end){
//         int[] chars = new int[128];
//         for(int i = start; i <= end; i++){
//             char c = s.charAt(i);
//             chars[c]++;
//             if(chars[c] > 1) return false;
//         }
//         return true;
//     }