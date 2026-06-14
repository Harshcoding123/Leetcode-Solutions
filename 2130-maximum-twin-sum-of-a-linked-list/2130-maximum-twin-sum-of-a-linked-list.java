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
        ArrayList<Integer>a= new ArrayList<>();
        ListNode t =head;
        while(t!=null){
            a.add(t.val);
            t =t.next;

        }
        int i=0;int j =a.size()-1;
        int sum =-1;
        while(i<j){
            sum= Math.max(sum,a.get(i)+a.get(j));
            i++;j--;
        }
        return sum;



        
    }
}