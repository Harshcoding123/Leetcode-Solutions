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
    void func(TreeNode root,int val){

        if(root==null){
            root= new TreeNode(val);
            return;
        }
        TreeNode t;
        if(val<root.val){
            if(root.left!=null)  func(root.left,val);
            else{
                 t =new TreeNode(val);
                root.left =t;
                return;
            }
        }
        else if(val>root.val){
            if(root.right!=null)  func(root.right,val);
            else{
                t= new TreeNode(val);
                root.right =t;
                return;
            }
        }

    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            root= new TreeNode(val);
            return root;
        }
        func(root,val);
        return root;
    }
}