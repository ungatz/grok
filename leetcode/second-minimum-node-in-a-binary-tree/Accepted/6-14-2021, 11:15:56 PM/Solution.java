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
    public int findSecondMinimumValue(TreeNode root) {
        Set<Integer> set = new TreeSet<Integer>();
        traversal(root, set);
        if(set.size() == 1)//if set has only oe elememt, return false
            return -1;
        System.out.print(set);
       Iterator<Integer> itr = set.iterator();
        itr.next();//move to next element
        return itr.next();
        
    }
    private void traversal(TreeNode root, Set<Integer> set){
        if(root != null){
            set.add(root.val);
            traversal(root.left, set);
            traversal(root.right, set);            

        }
    }
}