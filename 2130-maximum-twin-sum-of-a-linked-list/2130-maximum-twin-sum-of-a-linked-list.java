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
    public int pairSum(ListNode head) {
        int n=0;
        ListNode t =head;
        while(t!=null){
            n++;
            t =t.next;
        }
        n/=2;
        ListNode curr =head;
        for(int i=1;i<=n;i++){
            curr= curr.next;
        }
        ListNode pre= null;
        ListNode agla= curr.next;
        while(curr!=null){
            curr.next= pre;
            pre= curr;
            curr =agla;
           if(agla!=null) agla =agla.next;
        }
        curr= pre;
        t= head;
        int sum= -1;
        for(int i=1;i<=n;i++){
            sum= Math.max(sum,t.val+curr.val);
            t =t.next;curr =curr.next;
        }
        return sum;
    }
}