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
    int ans=0;
     int h(TreeNode root){
        if(root==null) return 0;
        int v1= h(root.left);
        int v2 =h(root.right);
        int v =Math.max(v1,v2);
        ans = Math.max(ans,v1+v2);
        return v+1;
    }
    int func(TreeNode root){
        if(root==null) return 0;
        int v= h(root.left)+h(root.right);
        int v1= func(root.left);
        int v2 =func(root.right);
        return Math.max(v,Math.max(v1,v2));
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
    //  return func(root);  
    int v= h(root);
    return ans; 
    
    }
}