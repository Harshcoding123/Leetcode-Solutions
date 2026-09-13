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
    void func(TreeNode root,boolean vis[],int c,List<Integer>a){
        if(root==null) return;
        if(!vis[c]){
            vis[c]= true;
            a.add(root.val);
        }
        func(root.right,vis,c+1,a);
        func(root.left,vis,c+1,a);
    }
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer>a =new ArrayList<>();
        boolean vis[]= new boolean[101];
        func(root,vis,1,a);
        return a;
    }
}