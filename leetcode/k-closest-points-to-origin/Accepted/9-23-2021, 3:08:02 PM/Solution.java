// https://leetcode.com/problems/k-closest-points-to-origin

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, (p1, p2) -> {
            return distance(p1) - distance(p2);
        });
        int[][] res = new int[k][2];
        for(int i = 0; i < k; i++){
            res[i] = new int[] {points[i][0], points[i][1]};
        }
        return res;
    }
    public int distance(int[] a){
        return a[0]*a[0] + a[1]*a[1];
    }
}