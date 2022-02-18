// https://leetcode.com/problems/valid-parentheses

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') stack.push(c);
            else {
                if(stack.isEmpty()) return false;
                if(c == ')' && stack.peek() == '(') stack.pop(); 
                if(c == '}' && stack.peek() == '{') stack.pop();  
                if(c == ']' && stack.peek() == '[') stack.pop();  
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}