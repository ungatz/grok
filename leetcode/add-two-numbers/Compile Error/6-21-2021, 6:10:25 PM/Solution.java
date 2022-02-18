// https://leetcode.com/problems/add-two-numbers

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry;
        ListNode p = l1.head;
        ListNode q = l2.head;
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        while(p != null || q != null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
              
            int sum = x + y + carry;
            carry = sum / 10;
            
            current.next = new ListNode(sum % 10);
        }
        if(carry == 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
  }