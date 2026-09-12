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
    boolean check(TreeNode root,TreeNode subRoot){
        if(root==null&&subRoot!=null) return false;
        else if(root!=null&&subRoot==null) return false;
        else if(root==null&&subRoot==null) return true;
        if(root.val!=subRoot.val) return false;
        boolean v1= check(root.left,subRoot.left);
        boolean v2 =check(root.right,subRoot.right);
        return v1&&v2;
    }
    boolean func(TreeNode root,TreeNode subRoot){
        if(root==null) return false;
        if(root.val==subRoot.val){
            if(check(root,subRoot)) return true;
        }
        boolean v1= func(root.left,subRoot);
        boolean v2 =func(root.right,subRoot);
        return v1||v2;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return func(root,subRoot);
    }
}