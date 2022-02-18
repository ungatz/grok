// https://leetcode.com/problems/find-original-array-from-doubled-array

class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2 != 0) return new int[] {};
        Set<Integer> set = new HashSet<>();
        for(int i: changed) set.add(i);
        for(int i = 0; i < changed.length; i++){
            if(changed[i] != 0 && set.contains(changed[i]*2)) {
                set.remove(changed[i]*2);
                if(set.size() == changed.length/2) break;
            }
        }
        if(set.size() != changed.length/2) return new int[] {};
        int[] orignal = new int[set.size()]; 
        List<Integer> temp = new ArrayList<>();
        for(Integer i: set) temp.add(i);
        for(int i = 0; i < temp.size(); i++) orignal[i] = temp.get(i);
        return orignal;
    }
}