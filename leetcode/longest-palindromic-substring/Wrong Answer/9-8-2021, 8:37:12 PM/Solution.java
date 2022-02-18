// https://leetcode.com/problems/longest-palindromic-substring

class Solution {
    public String longestPalindrome(String s) {
        StringBuilder sR = new StringBuilder(s);
        sR.reverse();
        int m = s.length();
        int n = sR.length();
        int[][] dp = new int[m+1][n+1];
        String res = "";
        while(m > 0 && n > 0){
            if(s.charAt(m-1) == sR.charAt(n-1)){
                res += s.charAt(m-1);
                m--;
                n--;
            }else{
            if(dp[m][n-1] > dp[m-1][n]) n--;
            else m--;
            }   
        }
        return res;
    }
    public int lps(String s1, String s2, int m, int n, int[][] dp){
        if(m == 0 || n == 0) return dp[m][n] = 0;
        if(s1.charAt(m-1) == s2.charAt(n-1)) return dp[m][n] = 1+lps(s1,s2,m-1,n-1,dp);
        return dp[m][n] = Math.max(lps(s1,s2,m-1,n,dp),lps(s1,s2,m,n-1,dp));
    }
}