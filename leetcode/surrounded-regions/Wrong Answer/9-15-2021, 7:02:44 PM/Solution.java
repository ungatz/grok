// https://leetcode.com/problems/surrounded-regions

class Solution {
    public void solve(char[][] board) {
        for(int i = 1; i < board.length; i++){
            for(int j = 1; j < board[0].length; j++){
                if(board[i][j] == 'O'){
                    dfs(board, i, j);
                }
            }
        }
    }
    public void dfs(char[][] board, int x, int y){
        if(isSafe(x, y, board)){
            board[x][y] = 'X';
            dfs(board, x+1, y);
            dfs(board, x-1, y);
            dfs(board, x, y+1);
            dfs(board, x, y-1);
        } else{
            return;
        }
    }
    public boolean isSafe(int x, int y, char[][] board){
        return (x>0 && y>0) && (x < board.length-1 && y < board[0].length-1) && (board[x][y] == 'O');
    }
}