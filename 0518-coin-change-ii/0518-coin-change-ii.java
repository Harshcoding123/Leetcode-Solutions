class Solution {
    int func(int c[],int idx,int s,int k,int dp[][]){
       
        if(s==k) return 1;
        if(s>k) return 0;
        if(idx>=c.length) return 0;
        if(dp[idx][s]!=-1) return dp[idx][s];
        int v1= func(c,idx,s+c[idx],k,dp);
        int v2= func(c,idx+1,s,k,dp);
        dp[idx][s]=v1+v2;
        return v1+v2;
    }
    public int change(int k, int[] c) {
        int dp[][] =new int[c.length][k+1];
        for(int i=0;i<c.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return func(c,0,0,k,dp);
    }
}