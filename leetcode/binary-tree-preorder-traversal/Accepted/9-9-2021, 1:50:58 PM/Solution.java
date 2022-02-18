// https://leetcode.com/problems/binary-tree-preorder-traversal

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
    public List<Integer> preorderTraversal(TreeNode root) {
         ArrayList<Integer> out = new ArrayList<Integer>();
        preorder(root, out);
        return out;
    }
    public static void preorder(TreeNode root, List<Integer> out){
        if(root == null) return;
        out.add(root.val);
        preorder(root.left, out);
        preorder(root.right, out);
    }
}