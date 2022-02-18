// https://leetcode.com/problems/swap-nodes-in-pairs

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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevA = dummy;
        while(head != null && head.next != null){
            ListNode A = head;
            ListNode B = head.next;
            // Swap as prev -> A -> B to prev -> B -> A
            prevA.next = B;
            A.next = B.next;
            B.next = A;
            
            prevA = A;
            head = A.next;
        }
        return dummy.next;
    }
}