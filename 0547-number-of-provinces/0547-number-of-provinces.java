class Solution {
    void func(int [][] a,int idx,boolean vis[]){
        
        vis[idx]= true;
        for(int i=0;i<a[idx].length;i++){
            
            if(!vis[i]&&a[idx][i]==1){
                func(a,i,vis);
            }
        }
    }
    public int findCircleNum(int[][] a) {
        boolean vis[] =new boolean [a.length];
        int ans=0;
        for(int i=0;i<vis.length;i++){
            if(!vis[i]){
                ans++;
                func(a,i,vis);
            }
        }
        return ans;
        
    }
}