// https://leetcode.com/problems/roman-to-integer

class Solution {
    public int romanToInt(String s) {
        int num = 0;
        int i = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("M", 1000);
        map.put("C", 100);
        map.put("D", 500);
        map.put("I", 1);
        map.put("V", 5);
        map.put("L", 50);
        map.put("X", 10);
        
        while(i < s.length()){
            String cur = s.substring(i, i+1);
            int curVal = map.get(cur);
            int nextVal = 0;
            if(i+1 < s.length()){
                String next = s.substring(i+1, i+2);
                nextVal = map.get(next);
            }
            if(curVal < nextVal){
                num += (nextVal - curVal);
                i += 2;
            } else {
                num += curVal;
                i++;
            }
        }
        return num;
    }
}