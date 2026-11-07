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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c=0;
        ListNode t1= l1;
        ListNode t2 =l2;
        ListNode temp=new ListNode(-1);
         ListNode p =temp;
        while(t1!=null&&t2!=null){
            int n= t1.val+t2.val+c;
            ListNode root= new ListNode(-1);
            if(n<=9){
                root.val= n;
                c=0;
            }else{
                int n1 =n%10;
                int n2= n/=10;
                root.val= n1;
                c= n2;
            }
            t1= t1.next;
            t2= t2.next;
            p.next =root;
            p =root;

        }
        while(t1!=null){
            ListNode root= new ListNode(-1);
            int n=t1.val+c;
            if(n<=9){
                root.val= n;
                c= 0;
            }else{
            int n1 =n%10;
            int n2= n/=10;
            root.val= n1;
            c= n2;
            }
            t1= t1.next;
              p.next =root;
            p =root;

        }
         while(t2!=null){
            ListNode root= new ListNode(-1);
            int n=t2.val+c;
            if(n<=9){
                root.val= n;
                c= 0;
            }else{
            int n1 = n%10;
            int n2= n/=10;
            root.val= n1;
            c= n2;
            }
            t2= t2.next;
              p.next =root;
            p =root;
            

        }
        if(c>0){
            ListNode root = new ListNode(c);
              p.next =root;
            p =root;
        }
        return temp.next;
        
    }
}