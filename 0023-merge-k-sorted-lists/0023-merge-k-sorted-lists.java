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
    public ListNode mergeKLists(ListNode[] a) {
       
        PriorityQueue<Integer>pq =new PriorityQueue<>();
        for(int i=0;i<a.length;i++){
            ListNode t =a[i];
            while(t!=null){
                pq.add(t.val);
                t =t.next;
            }

        }
        if(pq.size()==0) return  null;
        ListNode r= new ListNode(pq.remove());
       ListNode t =r;
        while(pq.size()>0){
            ListNode c =new ListNode(pq.remove());
            t.next= c;
            t= c;
        }
        return r;
        
    }
}