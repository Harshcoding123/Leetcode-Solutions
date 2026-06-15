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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null) return null;
        ListNode t= head;
        int n=0;
        while(t!=null) {
            n++;
            t =t.next;
        }
         n= n/2;
        t =head;
        for(int i=0;i<=n-2;i++){
            t =t.next;
        }
        t.next =t.next.next;
        return head;
        
    }
}