// https://leetcode.com/problems/check-if-a-string-is-a-valid-sequence-from-root-to-leaves-path-in-a-binary-tree

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
    public boolean isValidSequence(TreeNode root, int[] arr) {
        if(arr.length == 0)
            return false;
        return path(root, arr, 0);
    }
    public boolean path(TreeNode node, int[] seq, int seqIdx){
        if(node == null)
            return false;
        if(seqIdx >= seq.length || node.val != seq[seqIdx])
            return false;
        if(node.left == null && node.right == null && seqIdx == seq.length -1)
            return true;
        return path(node.left, seq, seqIdx+1) || path(node.right, seq, seqIdx+1);
    }
}