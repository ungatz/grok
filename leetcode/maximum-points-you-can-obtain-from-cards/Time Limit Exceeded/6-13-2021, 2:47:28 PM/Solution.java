// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards

class Solution {
    private int max = Integer.MIN_VALUE;
    public void helperFunc(int [] cardPoints, int k, int left, int right, int pts){
        if (k == 0) max  = Math.max(pts, max);
        else {
            helperFunc(cardPoints, k - 1, left + 1, right, pts + cardPoints[left]);
            helperFunc(cardPoints, k - 1, left, right - 1, pts + cardPoints[right]);
        }
    }
    public int maxScore(int[] cardPoints, int k) {
        helperFunc(cardPoints, k, 0, cardPoints.length - 1, 0);
        return max;
    }
}