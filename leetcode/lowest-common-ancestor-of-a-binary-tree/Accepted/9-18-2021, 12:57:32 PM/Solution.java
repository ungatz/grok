// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private TreeNode lca = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        findLCA(root, p, q);
        return this.lca;
    }
    public int findLCA(TreeNode root, TreeNode p, TreeNode q){
        if(root == null || this.lca != null) return 0;
        int r = (root == p || root == q) ? 1 : 0;
        int left = findLCA(root.left, p, q);
        int right = findLCA(root.right, p, q);
        if(r + left + right == 2 && this.lca == null) this.lca = root;
        return r+left+right;
    }
}