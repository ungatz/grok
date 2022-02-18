// https://leetcode.com/problems/robot-bounded-in-circle

class Solution {
    public boolean isRobotBounded(String instructions) {
        // d[0] north, d[1] east, d[2] south, d[3] west
        int[][] d = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        
        // initital pos (0,0)
        int x = 0, y = 0;
        
        // facing north
        int idx = 0;
        
        for(char c: instructions.toCharArray()){
            if(c == 'L'){
                // turn left basically +1 +1 +1 or -1
                // 1  turn to left is 3 turns to right 
                idx = (idx+3)%4;
            } else if(c == 'R'){
                idx = (idx+1)%4;
            }else{
                x += d[idx][0];
                y += d[idx][1];
            }
        }
        // if robot faces north after first cycle 
        // he's only gonna go up up up.
        // or if he don't reach his initital pos there can't 
        // be no cycle.
        
        return (x == 0 && y == 0) || (idx != 0);
    }
}