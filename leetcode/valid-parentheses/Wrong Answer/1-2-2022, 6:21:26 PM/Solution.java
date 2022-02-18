// https://leetcode.com/problems/valid-parentheses

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i = 1; i < s.length() && !stack.isEmpty(); i++){
            if(s.charAt(i) == ')' && stack.peek() == '(') stack.pop();
            else if(s.charAt(i) == '}' && stack.peek() == '{') stack.pop();
            else if(s.charAt(i) == ']' && stack.peek() == '[') stack.pop();
            else stack.push(s.charAt(i));
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}