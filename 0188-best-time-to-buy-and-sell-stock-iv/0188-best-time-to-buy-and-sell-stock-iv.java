class Solution {
    int func(int a[],int idx,int k,int dp[][]){
        int ans= 0;
        if(k==0) return 0;
        if(idx==a.length-1) return 0;
        if(dp[idx][k]!=-1) return dp[idx][k];
        for(int i=idx+1;i<a.length;i++){
            if(a[idx]<a[i]){
                ans =Math.max(ans,func(a,i,k-1,dp)+Math.abs(a[i]-a[idx]));
            }else{
                ans= Math.max(ans,func(a,i,k,dp));
            }
        }
        dp[idx][k]= ans;
        return ans;
    }
    public int maxProfit(int k, int[] prices) {
        int dp[][] =new int[prices.length][k+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return func(prices,0,k,dp);
    }
}