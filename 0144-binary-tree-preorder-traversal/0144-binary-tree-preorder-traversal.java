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
    void func(TreeNode root,List<Integer>a){
        if(root==null) return;
        a.add(root.val);
        func(root.left,a);
        func(root.right,a);

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer>a =new ArrayList<>();
        func(root,a);
        return a;
        
    }
}