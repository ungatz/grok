// https://leetcode.com/problems/surrounded-regions

class Solution {
    public void solve(char[][] board) {
        int m = board.length ;
        int n = board[0].length;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i == 0 || j == 0 || i == m-1 || j == n-1){
                    if(board[i][j] == 'O'){
                        dfs(board , i,j);
                    }
                }
            }
        }
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(board[i][j] == '2'){ 
                    board[i][j] = 'O';
                }
                else{
                    board[i][j] = 'X';
                }
            }
        }
    }
	
    public void dfs(char[][] board , int i , int j){
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O'){
            return ;
        }
        if(board[i][j] == 'O'){
            board[i][j] = '2'; // changing the value of 'O' that can be reached through the boundary 'O'
            dfs(board , i+1,j);
            dfs(board , i-1,j);
            dfs(board , i,j+1);
            dfs(board , i,j-1);
        }
    }
}
