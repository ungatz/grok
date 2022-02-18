// https://leetcode.com/problems/island-perimeter

class Solution {
    public int islandPerimeter(int[][] grid) {
        int p = 0;
        for(int i = 0; i <= grid.length-1; i++){
            for(int j = 0; j <= grid[i].length-1; j++){
                if(grid[i][j] == 1){
                    p += 4;
                    if(j != grid[i].length-1) if(grid[i][j+1] == 1) p--;
                    if(j != 0) if(grid[i][j-1] == 1) p--;
                    if(i != grid.length-1) if(grid[i+1][j] == 1) p--;
                    if(i != 0) if(grid[i-1][j] == 1) p--;
                 }
            }
        }
        return p;
    }
}