// https://leetcode.com/problems/path-sum

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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return paths(root, 0, targetSum);
    }
    public boolean paths(TreeNode root, int sum, int target){
        if(root == null) return false;
        if(root != null) sum += root.val;
        if(sum == target) return true;
        boolean ans = paths(root.left, sum, target) || paths(root.right, sum, target);
        return ans;
    }
}