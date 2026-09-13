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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans =new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode>q =new LinkedList<>();
        q.add(root);
        
        
        int c=1;
        while(q.size()>0){
            ArrayList<Integer>a =new ArrayList<>();
            int c1=0;
            for(int i=1;i<=c;i++){
                TreeNode v =q.remove();
                a.add(v.val);
                if(v.left!=null){
                     q.add(v.left);
                     c1++;
                }
                if(v.right!=null){
                     q.add(v.right);
                     c1++;
                }

            }
            ans.add(a);
            c =c1;
        }
        return ans;
        
    }
}