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
    int h(TreeNode root){
        if(root==null) return 0;
        int v =Math.max(h(root.left),h(root.right));
        return v+1;
    }
    boolean func(TreeNode root){
        if(root==null) return true;
        int v1 =h(root.left);
        int v2 =h(root.right);
        if(Math.abs(v1-v2)>1) return false;
        boolean e1= func(root.left);
        boolean e2 =func(root.right);
        return e1&&e2;
    }
    public boolean isBalanced(TreeNode root) {
        return func(root);
    }
}