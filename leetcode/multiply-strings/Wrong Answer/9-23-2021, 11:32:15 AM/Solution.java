// https://leetcode.com/problems/multiply-strings

class Solution {
    public String multiply(String num1, String num2) {
        return Long.toString(Long.parseLong(num1) * Long.parseLong(num2));
    }
}