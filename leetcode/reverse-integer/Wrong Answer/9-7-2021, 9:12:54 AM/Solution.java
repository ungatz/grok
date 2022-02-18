// https://leetcode.com/problems/reverse-integer

class Solution {
    public int reverse(int x) {
        if(x >= 1534236469) return 0;
        int rev = 0;
        while(x != 0){
            int rem = x%10;
            rev = rev*10 + rem;
            x = x/10;
        }
        return rev;
    }
}