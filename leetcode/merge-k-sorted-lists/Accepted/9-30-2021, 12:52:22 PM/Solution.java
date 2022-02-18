// https://leetcode.com/problems/merge-k-sorted-lists

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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<Integer>();
        for(ListNode l: lists){
            while(l != null){
                list.add(l.val);
                l = l.next;
            }
        }
        Collections.sort(list);
        
        ListNode head = new ListNode(0);
        ListNode dummy = head;
        
        for(int i: list){
            dummy.next = new ListNode(i);
            dummy = dummy.next;
        }
        return head.next;
    }
}