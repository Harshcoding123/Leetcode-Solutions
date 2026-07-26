class Solution {
    int func(int n,int k,int t,int s,int dp[][]){
        int mod =1000000000+7;
        if(n==0){
            if(s==t) return 1;
            return 0;
        }
        if(dp[n][s]!=-1) return dp[n][s];
        int v=0;
        for(int i=1;i<=k;i++){
            if(s+i>t) break;
            v=(v+func(n-1,k,t,s+i,dp))%mod;
            
        }
        dp[n][s]= v%mod;
        return dp[n][s];
    }
    public int numRollsToTarget(int n, int k, int t) {
        if(t<n) return 0;
        int dp[][]= new int[n+1][t+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return func(n,k,t,0,dp);
    }
}