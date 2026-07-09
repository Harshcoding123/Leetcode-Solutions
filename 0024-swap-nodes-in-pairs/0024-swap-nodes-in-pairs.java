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
        if(head==null||head.next==null) return head;
        ListNode d= new ListNode(-1);
        d.next =head;
        ListNode p= d;
        ListNode c =head;
        ListNode a =c.next;
        while(c!=null&&c.next!=null){
            c.next =a.next;
            a.next= c;
            p.next =a;
            p= c;
            c= c.next;
           if(c!=null) a= c.next;

        }
        return d.next;
        
    }
}