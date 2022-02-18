// https://leetcode.com/problems/linked-list-cycle

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        ListNode p1 = head;
        ListNode p2 = head;
        while(p1.next != null && p2.next.next!=null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1 == p2) {
                return true;
            }
        }
        
        return false;
        
    }
}