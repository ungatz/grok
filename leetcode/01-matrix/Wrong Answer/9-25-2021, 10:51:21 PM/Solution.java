// https://leetcode.com/problems/01-matrix

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] dist = new int[mat.length][mat[0].length];
        int n = mat.length;
        int m = mat[0].length;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        // top and left
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] == 0) dist[i][j] = 0;
                else {
                    if(i > 0) {
                        dist[i][j] = Math.min(dist[i][j], dist[i-1][j]+1);
                    }
                    if(j > 0) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][j-1]+1);
                    }
                }
            }
        }
        // bottom and right
        for(int i = n-1; i > 0; i--){
            for(int j = m-1; j > 0; j--){
                    if(i < n-1) {
                        dist[i][j] = Math.min(dist[i][j], dist[i+1][j]+1);
                    }
                    if(j < m-1) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][j+1]+1);
                    }
                }
            }
        
        return dist;
    }
}

// Brute force
// int[][] dist = new int[mat.length][mat[0].length];
//         int n = mat.length;
//         int m = mat[0].length;
        
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < m; j++){
//                 dist[i][j] = Integer.MAX_VALUE;
//             }
//         }
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < m; j++){
//                 if(mat[i][j] == 0) dist[i][j] = 0;
//                 else if(mat[i][j] == 1) {
//                     for(int k = 0; k < n; k++){
//                         for(int l = 0; l < m; l++){
//                            if(dist[k][l] == 0) {
//                                 int curDist = Math.abs(k-i) + Math.abs(l-j);
//                                dist[i][j] = Math.min(dist[i][j], curDist);
//                            }
//                          }
//                     }
//                 }
//             }
//         }
//         return dist;