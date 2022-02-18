// https://leetcode.com/problems/happy-number

class Solution {
    public boolean isHappy(int n) {
        if(n%10 == n) return false;
        int res = sum(n);
        while(res != 1){
           res = sum(res);
            if(res == 1) return true;
       }
        return false;
    }
    public int sum(int n){
         int sum = 0;
         while(n != 0){
            int digit  = n%10;
            sum = sum + digit*digit;
            n = n/10;
        }
        return sum;
    }
}