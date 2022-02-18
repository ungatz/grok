// https://leetcode.com/problems/longest-common-subsequence

class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[1001][1001];
        return lcs(s1, s2, m, n, dp);
    }
    public int lcs(String s1, String s2, int m, int n, int[][] dp){
        if(m == 0 || n == 0) return 0;
        if(dp[m][n] != 0) return dp[m][n];
        if(s1.charAt(m-1) == s2.charAt(n-1)) return dp[m][n] = 1 + lcs(s1, s2, m-1, n-1, dp);
        return dp[m][n] = Math.max(lcs(s1, s2, m-1, n, dp) , lcs(s1, s2, m, n-1, dp));
    }
}