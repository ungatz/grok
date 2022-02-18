// https://leetcode.com/problems/count-and-say

class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        if(n == 2) return "11";
        
        String ans = "11";
        for(int i = 3; i <= n; i++){
            String t = "";
            ans = ans+"&";
            int count = 1;
            for(int j = 1; j < ans.length(); j++){
            if(ans.charAt(j) != ans.charAt(j-1)){
                t = t+count;
                t = t+ans.charAt(j-1);
                count = 1;
             } else {
                count++;
                }
            }
          ans = t;
    }
        return ans;
}
}