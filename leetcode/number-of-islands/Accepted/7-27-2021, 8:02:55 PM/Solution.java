// https://leetcode.com/problems/number-of-islands

class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    callDFS(grid, i, j);
                }
            }
        }
        return count;
    }
    
    public void callDFS(char[][] grid, int i, int j){
        if(isSafe(grid, i, j)){
            grid[i][j] = '0';
            callDFS(grid, i+1, j);
            callDFS(grid, i-1, j);
            callDFS(grid, i, j+1);
            callDFS(grid, i, j-1);
        }
    }
    
    private boolean isSafe(char[][] grid, int x, int y) {
        return x>=0 && y>=0 && x<grid.length && y<grid[0].length && grid[x][y] == '1';
    }
}