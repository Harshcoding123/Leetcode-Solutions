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
    public int numComponents(ListNode head, int[] nums) {
        // HashMap<Integer,ListNode>mp= new HashMap<>();
        HashSet<Integer>st =new HashSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        // ListNode t =head;
        // while(t!=null){
        //     mp.put(t.val,t);
        //     t =t.next;
        // }
        int ans=0;
       ListNode t= head;
        while(t!=null){
            if(!st.contains(t.val)) t= t.next;
            else{
                while(t!=null&&st.contains(t.val)) t= t.next;
                ans++;
            }
        }
        return ans;
        
    }
}