// https://leetcode.com/problems/intersection-of-two-arrays-ii

class Solution {
    public int[] intersect(int[] n1, int[] n2) {
        Arrays.sort(n1);
        Arrays.sort(n2);
        int i = 0;
        int j = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while(i < n1.length && j < n2.length){
            if(n1[i] > n2[j]) i++;
            if(n1[i] < n2[j]) j++;
            else {
                res.add(n1[i]);
                i++;
                j++;
            }
            
        }
        int[] resArr = new int[res.size()];
         i = 0;
        for(Integer el: res){
            resArr[i] = el;
            i++;
        }
        return resArr;
    }
}