// https://leetcode.com/problems/binary-tree-postorder-traversal

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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> out = new ArrayList<Integer>();
        postorder(root,out);
        return out;
    }
    public void postorder(TreeNode root, List<Integer> out){
        if(root == null) return;
        postorder(root.left, out);
        postorder(root.right, out);
        out.add(root.val);
    }
}