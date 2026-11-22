class Solution {
    int func(int n,int idx,boolean vis[]){
        if(idx>n) return 1;
        int v=0;
        for(int i=1;i<=n;i++){
            if(!vis[i]){
            if(i%idx==0||idx%i==0){
                vis[i] =true;
              v+= func(n,idx+1,vis);
              vis[i]= false;
            }
            }
        }
        return v;

    }
    public int countArrangement(int n) {
        boolean vis[] =new boolean[n+1];
        return func(n,1,vis);
        
    }
}