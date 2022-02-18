// https://leetcode.com/problems/path-sum-ii

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
    pub fn path_sum(root: Option<Rc<RefCell<TreeNode>>>, target_sum: i32) -> Vec<Vec<i32>> {
        let mut all: Vec<Vec<i32>> = vec![];
        let mut current_path = vec![];
        Self::find_path(root, target_sum, &mut all, &mut current_path);
        all
    }
    pub fn find_path(node: Option<Rc<RefCell<TreeNode>>>, target_sum: i32, all: &mut Vec<Vec<i32>>, current: &mut Vec<i32>) {
        match node {
            Some(x) => {
                let cur = x.borrow();
                current.push(cur.val);
                if cur.val == target_sum && cur.left.is_none() && cur.right.is_none(){
                    all.push(current.to_vec());
                } else {
                    Self::find_path(cur.right.clone(), target_sum - cur.val, all, current);
                    Self::find_path(cur.left.clone(), target_sum - cur.val, all, current);
                }
                current.remove(current.len()-1);
            },
            _ => return,
        }
    }
    
}