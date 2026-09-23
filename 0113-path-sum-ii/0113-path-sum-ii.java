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
    void func(TreeNode root,int t,ArrayList<Integer>a,List<List<Integer>>ans){
        if(root==null) return;
        if(root.left==null&&root.right==null){
            if(t-root.val==0){
                a.add(root.val);
                ans.add(new ArrayList<>(a));
                a.remove(a.size()-1);
            }
        }
        // if(t-root.val<=0) return;
        a.add(root.val);


        func(root.left,t-root.val,a,ans);
        func(root.right,t-root.val,a,ans);
        a.remove(a.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int t) {
        List<List<Integer>>ans =new ArrayList<>();
        ArrayList<Integer>a =new ArrayList<>();
        func(root,t,a,ans);
        return ans;
    }
}