// https://leetcode.com/problems/count-good-nodes-in-binary-tree

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
    int count = 0;
    public int goodNodes(TreeNode root) {
        // idea is to store the value of previous max node while doing 
        // dfs to keep on checking if the value of current node is
        // greater than all the previous nodes.
        // if it ain't then its not a good node.
        dfs(root, Integer.MIN_VALUE);
        return count;
    }
    public void dfs(TreeNode node, int max){
        if(node.val >= max) {
            count++;
        }
        // logic for dfs
        if(node.left != null) dfs(node.left, Math.max(node.val, max));
        if(node.right != null) dfs(node.right, Math.max(node.val, max));
    }
}