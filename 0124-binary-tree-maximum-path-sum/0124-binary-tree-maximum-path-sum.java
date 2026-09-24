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
    int max=Integer.MIN_VALUE;

    int max(TreeNode root){
        if(root==null) return 0;
        int v1= max(root.left);
        int v2 =max(root.right);
        int v= Math.max(v1,v2);
         int e= root.val;
        if(e+v1>e) e+=v1;
        if(e+v2>e) e+=v2;
        max= Math.max(max,e);
        
        if(v+root.val>root.val) 
        return v+root.val;
        return root.val;

    }
    int func(TreeNode root){
        if(root==null) return Integer.MIN_VALUE;
        int v1= max(root.left);
        int v2 =max(root.right);
        int v=root.val;
        if(v+v1>v) v+=v1;
        if(v+v2>v) v+=v2;
      
        int e1= func(root.left);
        int e2 =func(root.right);
        return Math.max(v,Math.max(e1,e2));
    }
    public int maxPathSum(TreeNode root) {
        int v= max(root);
        return max;
        // return func(root);
    }
}