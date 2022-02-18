// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards

class Solution {
    private int max = Integer.MIN_VALUE;
    public int helperFunc(int [] cardPoints, int k, int left, int right, int pts, Map<String, Integer> cache){
        if (k == 0) return pts; 
        else {
            String key = left + " " + right;
            if(cache.containsKey(key)){
                return cache.get(key);
            } else {
                int leftSub = helperFunc(cardPoints, k - 1, left + 1, right, pts + cardPoints[left], cache);
           int rightSub =  helperFunc(cardPoints, k - 1, left, right - 1, pts + cardPoints[right], cache);
                int res = Math.max(leftSub, rightSub);
                cache.put(key, res);
                return res;
            }
        }
    }
    public int maxScore(int[] cardPoints, int k) {
        return helperFunc(cardPoints, k, 0, cardPoints.length - 1, 0, new HashMap<>());
    }
}