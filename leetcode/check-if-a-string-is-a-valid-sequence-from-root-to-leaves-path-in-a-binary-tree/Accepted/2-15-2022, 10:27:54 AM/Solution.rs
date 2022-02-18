// https://leetcode.com/problems/check-if-a-string-is-a-valid-sequence-from-root-to-leaves-path-in-a-binary-tree

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
#[allow(dead_code)]
impl Solution {
    pub fn is_valid_sequence(root: Option<Rc<RefCell<TreeNode>>>, arr: Vec<i32>) -> bool {
        if root.is_none() {
             return false;
        }
        Self::check(&root, &arr, 0)
    }
    pub fn check(node: &Option<Rc<RefCell<TreeNode>>>, seq: &Vec<i32>, seq_idx: usize) -> bool {
        if let Some(node) = node {
            let node = node.borrow();
            let left = &node.left;
            let right = &node.right;
            if seq_idx >= seq.len() || node.val != seq[seq_idx]{
                return false;
            }
            if left.is_none() && right.is_none() && seq_idx == seq.len() - 1 && node.val == seq[seq_idx] {
                return true;
            }
            Self::check(&node.left, seq, seq_idx+1) || Self::check(&node.right, seq, seq_idx+1)
        } else {
            false
        }
    }
}