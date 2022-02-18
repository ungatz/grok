// https://leetcode.com/problems/binary-tree-level-order-traversal

class Solution {
    // Recursion
//     List<List<Integer>> levels = new ArrayList<List<Integer>>();
//     public void helper(TreeNode node, int level) {
//         // start the current level
//         if (levels.size() == level)
//             levels.add(new ArrayList<Integer>());

//          // fulfil the current level
//          levels.get(level).add(node.val);

//          // process child nodes for the next level
//          if (node.left != null)
//             helper(node.left, level + 1);
//          if (node.right != null)
//             helper(node.right, level + 1);
//     }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        if (root == null) return levels;
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
        // start the current level
          levels.add(new ArrayList<Integer>());

          // number of elements in the current level
          int level_length = queue.size();
          for(int i = 0; i < level_length; ++i) {
            TreeNode node = queue.remove();

            // fulfill the current level
            levels.get(level).add(node.val);

            // add child nodes of the current level
            // in the queue for the next level
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
          }
          // go to next level
          level++;
        }
        return levels;
    }
}