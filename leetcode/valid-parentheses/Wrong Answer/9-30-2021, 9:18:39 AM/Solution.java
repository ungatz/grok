// https://leetcode.com/problems/valid-parentheses

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(0));
        for(int i = 1; i < s.length() && !stack.isEmpty(); i++){
            Character cur = stack.peek();
            if(cur == '(' && s.charAt(i) == ')') stack.pop();
            else if(cur == '[' && s.charAt(i) == ']') stack.pop();
            else if(cur == '{' && s.charAt(i) == '}') stack.pop();
            else stack.push(s.charAt(i));
        }
        
        if(stack.isEmpty()) return true;
        return false;
    }
}