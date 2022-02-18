// https://leetcode.com/problems/longest-common-prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        if(strs.length == 2) {
            if(strs[0].charAt(0) == strs[1].charAt(0)) return strs[0].length() < strs[1].length() ? strs[0] : strs[1];
        }
        String lcp = "";
        int min = strs[0].length();
        for(int i = 0; i < strs.length; i++){
            if(min > strs[i].length()) min = strs[i].length();
        }
        System.out.println(min);
        for(int i = 0; i < strs.length-2; i++){
            for(int j = 0; j < min; j++){
                if(strs[i].charAt(j) == strs[i+1].charAt(j) &&
                  strs[i+1].charAt(j) == strs[i+2].charAt(j)){
                    lcp += strs[i].charAt(j);
                }
            }
        }
        return lcp;
    }
}