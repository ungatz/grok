// https://leetcode.com/problems/maximum-depth-of-binary-tree

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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int cL = 0;
        int cR = 0;
        TreeNode current = root.left;
        while(current != null){
            cL++;
            current = current.left;
        }
        current = root.right;
        while(current != null){
            cR++;
            current = current.right;
        }
        return Math.max(cL+1,cR+1);
    }
}