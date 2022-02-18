// https://leetcode.com/problems/verifying-an-alien-dictionary

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] dict = new int[26];
        for (int i = 0; i < order.length(); i++){
            dict[order.charAt(i)-'a'] = i;
        }
        for(int i = 0; i < words.length - 1; i++){
            for(int start = 0; start < words[i].length(); start++){
                if(start >= words[i+1].length()) return false;
                if(words[i].charAt(start) != words[i+1].charAt(start)){
                    int cur = words[i].charAt(start)-'a';
                    int next = words[i+1].charAt(start)-'a';
                    if(dict[cur] > dict[next]) return false;
                    else break;
                }                
            }
        }
        return true;
    }
}