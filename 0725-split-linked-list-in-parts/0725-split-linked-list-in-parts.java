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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode t= head;int n=0;
        int idx=0;
        while(t!=null){
            n++;
            t= t.next;
        }
        
        if(n<=k){
            ListNode g[]= new ListNode[k];
            ListNode c =head;
            
            
            for(int i=0;i<k;i++){
              if(c!=null){
                ListNode a= c.next;
                c.next= null;
                g[i]= c;
                c= a;
              }else g[i]= null;

            }
            return g;


        }
        int k1 =n/k;
        int k2= n%k;
        ListNode g[]= new ListNode[k];
        ListNode st= head;
        ListNode v =head;
         t= head;
        for(int i=1;i<=k;i++){
            v =st;
            t =v;
            for(int j=1;j<k1;j++){
                t= t.next;
            }
            if(k2>0){
                t= t.next;
                k2--;
            }
            st =t.next;
            t.next= null;
            g[idx++]= v;

        }
        return g;


        
    }
}