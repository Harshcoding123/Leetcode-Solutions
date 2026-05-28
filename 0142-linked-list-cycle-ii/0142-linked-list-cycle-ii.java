/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return  null;
        if(head.next==null) return null;
        ListNode slow=head;ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            fast= fast.next.next;
            slow =slow.next;
            if(fast==slow) break;
        }
        if(fast!=slow) return null;
        ListNode curr=head;
        while(curr!=slow){
            curr= curr.next;
            slow =slow.next;
        }
        return curr;
        
        
    }
}