// https://leetcode.com/problems/partition-list

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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode smallP = dummy1;
        ListNode greaterP = dummy2; 
        while(head != null){
            if(head.val < x) {
                smallP.next = head;
                smallP = smallP.next;
            } else if(head.val >= x) {
                greaterP.next = head;
                greaterP = greaterP.next;
            }
            head = head.next;
        }
        greaterP.next = null;
        smallP.next = dummy2.next;
        return dummy1.next;
    }
}