// https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses

class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> index = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') stack.push(i);
            if(s.charAt(i) == ')') {
                if(stack.isEmpty()) index.add(i);
                else stack.pop();
            }
        }
        while(!stack.isEmpty()) index.add(stack.pop());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(!index.contains(i)) sb.append(s.charAt(i));
        }
        
        return sb.toString();
    }
}