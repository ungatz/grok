// https://leetcode.com/problems/find-original-array-from-doubled-array

class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2!=0) return new int[0];
        Arrays.sort(changed);
        int[] orignal = new int[changed.length/2];
        int[] freq = new int[100001];
        int idx = 0;
        for(int i: changed) freq[i]++;
        
        for(int n: changed){
            if(freq[n]>0 && n*2 <= 100000 && freq[n*2] >0){
                freq[n]--;
                freq[n*2]--;
                orignal[idx] = n;
                idx++;
            }
        }
        
        // if all elements ain't cleared we don't have and doubled array
        for(int i: freq){
            if(i != 0) return new int[] {};
        }
        
        return orignal;
    }
}