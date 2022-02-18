// https://leetcode.com/problems/plus-one

class Solution {
    public int[] plusOne(int[] d) {
        for(int i = d.length - 1; i >= 0; i--){
            if(d[i] < 9){
                d[i]++;
                return d;
            }else{
                d[i] = 0;
            }
            
        }
        int[] newD = new int[d.length + 1];
        newD[0] = 1;
        return newD;
    }
}