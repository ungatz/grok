// https://leetcode.com/problems/merge-two-sorted-lists

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        int len1 = 1;
        int len2 = 1;
        ListNode cur = l1;
        while(cur.next != null) {
            len1++;
            cur = cur.next;
        }
        cur = l2;
        while(cur.next != null) {
            len2++;
            cur = cur.next;
        }
        int len = len1+len2;
        PriorityQueue<Integer> q = new PriorityQueue<>(len, (a, b) -> a-b);
        for(int i = 0; i < len; i++){
            if(l1 != null){
            if(l1.val < l2.val) {
                q.add(l1.val);
                l1 = l1.next;
            }
            }
            if(l2 != null) {
            if(l2.val < l1.val){
                q.add(l2.val);
                l2 = l2.next;
            }
            }
            if(l1 != null && l2 != null && l1.val == l2.val) {
                q.add(l1.val);
                q.add(l2.val);
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        ListNode newList = new ListNode();
        ListNode dummy = newList;
        while(!q.isEmpty()){
            dummy.next = new ListNode(q.poll());
            dummy = dummy.next;
        }
        return newList.next;
    }
}