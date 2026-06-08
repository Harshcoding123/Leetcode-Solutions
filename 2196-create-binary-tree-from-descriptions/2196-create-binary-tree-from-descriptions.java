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
    public TreeNode createBinaryTree(int[][] d) {
        HashMap<Integer,TreeNode>mp =new HashMap<>();
        HashSet<Integer>stc =new HashSet<>();
        HashSet<Integer>stp =new HashSet<>();
        
        TreeNode p= null;
        TreeNode c= null;
        TreeNode root =null;
        for(int i=0;i<d.length;i++){
            int n= d[i][0];
            int n2= d[i][1];
            stp.add(n);
            stc.add(n2);
            if(mp.containsKey(n)) p= mp.get(n);
            else{
                 p= new TreeNode(n);
                 mp.put(n,p);
            }
            if(mp.containsKey(n2)) c= mp.get(n2);
            else{
                 c =new TreeNode(n2);
                 mp.put(n2,c);
            }
            if(d[i][2]==1) p.left =c;
            else p.right =c;
        }
        int r= -1;
        for(var i:stp){
            if(!stc.contains(i)){
                r= i;
                break;
            }
        }
        return mp.get(r);
        
    }
}