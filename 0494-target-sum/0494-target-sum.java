class Solution {
    int func(int nums[],int n,int t,int idx,int dp[][]){
        if(idx>=nums.length){
            if(n==t) return 1;
            return 0;
        }
        if(dp[n+1000][idx]!=-1) return dp[n+1000][idx];
        int v1= func(nums,n+nums[idx],t,idx+1,dp);
        int v2= func(nums,n-nums[idx],t,idx+1,dp);
        dp[n+1000][idx]= v1+v2;
        return dp[n+1000][idx];
    }
    public int findTargetSumWays(int[] nums, int t) {
        
        int max =nums[0];
        
        int dp[][] =new int[2001][nums.length];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        
        return func(nums,0,t,0,dp);
    }
}