// https://leetcode.com/problems/cousins-in-binary-tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public boolean isCousins(TreeNode root, int x, int y) {
        // bfs level order traversal
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        boolean siblings = false;
        boolean cousins = false;
        while(!queue.isEmpty()){
            int depth = queue.size();
            for(int i = 0; i < depth; i++){
                TreeNode node = queue.remove();
                if(node == null) siblings = false;
                else {
                    if(node.val == x || node.val == y){
                        // could be our ans so...
                        if(!cousins){
                        cousins = siblings = true;
                        } else {
                            // not cousins
                            return !siblings;
                        }
                    }
                    if(node.left != null) queue.add(node.left);
                    if(node.right != null) queue.add(node.right);
                    queue.add(null);
                }
            }
            if(cousins) return false;
        }
        return false;
    }
}