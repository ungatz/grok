// https://leetcode.com/problems/kth-smallest-element-in-a-bst

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
    public int kthSmallest(TreeNode root, int k) {
        Set<Integer> set = new TreeSet<Integer>();
        traverse(root, set);
        Iterator<Integer> itr = set.iterator();
        for(int i = k; i > 1; i--){
            itr.next();
        }
        return itr.next();
    }
    public void traverse(TreeNode root, Set<Integer> set){
        if(root != null){
            set.add(root.val);
            traverse(root.left, set);
            traverse(root.right, set);
        }
    }
}