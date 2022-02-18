// https://leetcode.com/problems/valid-parentheses

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') stack.push(c);
            else {
            if(s.charAt(i) == ')' && stack.peek() == '(') stack.pop();
            else if(s.charAt(i) == '}' && stack.peek() == '{') stack.pop();
            else if(s.charAt(i) == ']' && stack.peek() == '[') stack.pop();
            else return false;
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}