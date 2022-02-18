// https://leetcode.com/problems/longest-common-prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        return lcp(strs, 0, strs.length-1);
    }
    public String lcp(String[] s, int l, int r){
        if(l == r) return s[l];
        else {
            int mid = (l + r)/2;
            String lcpLeft = lcp(s, l, mid);
            String lcpRight = lcp(s, mid+1, r);
            return cp(lcpLeft, lcpRight);
        }
    }
    public String cp(String l, String r){
        int min = Math.min(l.length(), r.length());
        for(int i = 0; i < min; i++){
            if(l.charAt(i) != r.charAt(i)) return l.substring(0,i);
        }
        return l.substring(0,min);
    }
}