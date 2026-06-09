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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode func(ArrayList<Integer>a,int i,int j){
        if(i>j) return null;
        int mid= (i+j)/2;
        TreeNode root= new TreeNode(a.get(mid));
        root.left= func(a,i,mid-1);
        root.right =func(a,mid+1,j);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        ListNode t= head;
        ArrayList<Integer>a =new ArrayList<>();
        while(t!=null){
            a.add(t.val);
            t =t.next;
        }
        return func(a,0,a.size()-1);
        
    }
}