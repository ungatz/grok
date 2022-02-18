// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards

class Solution {
        public int maxScore(int[] cardPoints, int k) {
        int total = 0, windowSum = 0;
        for (int i = 0; i < cardPoints.length; i++) {
            total += cardPoints[i];
            if (i < cardPoints.length - k) 
                windowSum += cardPoints[i];
        }
        
        int left = 0, right = cardPoints.length - k, res = total - windowSum;
        while (right < cardPoints.length) {
            windowSum += cardPoints[right++];
            windowSum -= cardPoints[left++];
            res = Math.max(total - windowSum, res);
        }
        
        return res;
    }


}