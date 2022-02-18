// https://leetcode.com/problems/find-original-array-from-doubled-array

class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2!=0) return new int[0];
        Arrays.sort(changed);
        int[] orignal = new int[changed.length/2];
        int[] freq = new int[100001];
        int idx = 0;
        for(int i: changed) freq[i]++;
        
        for(int i = 0; i < changed.length; i++){
            int element = changed[i];
            if(freq[element] > 0 && freq[element*2] > 0 && element*2 <= 10000){
                orignal[idx] = element;
                idx++;
                freq[element]--;
                freq[element*2]--;
            }
        }
        
        // if all elements ain't cleared we don't have and doubled array
        for(int i: freq){
            if(i != 0) return new int[] {};
        }
        
        return orignal;
    }
}