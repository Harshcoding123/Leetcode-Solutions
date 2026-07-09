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
    ArrayList<Integer>a;
    Random r;

    public Solution(ListNode head) {
        r =new Random();
        a=new ArrayList<>();
        ListNode t =head;
        while(t!=null){
            a.add(t.val);
            t= t.next;

        }
        
    }
    
    public int getRandom() {
        int idx= r.nextInt(a.size());
        return a.get(idx);

        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */