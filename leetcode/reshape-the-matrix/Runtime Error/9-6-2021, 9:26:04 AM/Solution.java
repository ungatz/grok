// https://leetcode.com/problems/reshape-the-matrix

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(r*c < m*n) return mat;
        int[] rowTraverse = new int[m*n];
        int k = 0;
        for(int i = 0; i < m && k < m*n; i++){
            for(int j = 0; j < n; j++){
                rowTraverse[k] = mat[i][j];
                k++;
            }
        }
        k = 0;
        int[][] revMat = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                revMat[i][j] = rowTraverse[k];
                k++;
            }
        }
        return revMat;
    }
}