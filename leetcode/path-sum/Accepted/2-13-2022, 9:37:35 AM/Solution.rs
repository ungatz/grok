// https://leetcode.com/problems/path-sum

// Definition for a binary tree node.
// #[derive(Debug, PartialEq, Eq)]
// pub struct TreeNode {
//   pub val: i32,
//   pub left: Option<Rc<RefCell<TreeNode>>>,
//   pub right: Option<Rc<RefCell<TreeNode>>>,
// }
// 
// impl TreeNode {
//   #[inline]
//   pub fn new(val: i32) -> Self {
//     TreeNode {
//       val,
//       left: None,
//       right: None
//     }
//   }
// }
use std::rc::Rc;
use std::cell::RefCell;
impl Solution {
    pub fn has_path_sum(root: Option<Rc<RefCell<TreeNode>>>, target_sum: i32) -> bool {
        if root.is_none() {
            return false;
        }
        match root {
            Some(x) => {
                let node = x.borrow();
                if target_sum - node.val == 0 && node.left.is_none() && node.right.is_none() {
                    return true;
                }
               return Self::has_path_sum(node.left.clone(), target_sum-node.val) || Self::has_path_sum(node.right.clone(), target_sum-node.val)
            },
            _ => return false,
        }
    }
}