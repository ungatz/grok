// https://leetcode.com/problems/second-minimum-node-in-a-binary-tree

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
    public int findMinimumValue(TreeNode current){
        while(current.left != null){
            current = current.left;
        }
        return current.val;
    }
    public int findSecondMinimumValue(TreeNode root) {
        while(true){
            if(root.left == null && root.right != null){
              findMinimumValue(root.right);
            }
            if(root.left != null && root.left.left == null && root.left.right == null && root.val != root.left.val){
                return root.val;
            }
            if(root.left != null && root.left.left == null && root.left.right == null && root.val == root.left.val){
                findMinimumValue(root.right);
            }
            
        }
    }
}