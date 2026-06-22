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
    public ListNode mergeNodes(ListNode head) {
        ListNode root =new ListNode(-1);
        ListNode p =root;
        ListNode t =head;
        while(t!=null){
            if(t.next==null) break;
            if(t.val==0){
                t= t.next;int s=0;
                while(t.val!=0){
                    s+=t.val;
                    t =t.next;
                }
                ListNode r =new ListNode(s);
                p.next= r;
                p= r;
            }
        }
        return root.next;
        
    }
}