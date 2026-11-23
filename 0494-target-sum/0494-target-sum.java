class Solution {
    int func(int nums[],int t,int idx,int sum,int dp[][]){
        if(idx==nums.length){
            if(sum==t) return 1;
            return  0;
        }
        if(dp[idx][sum+1000]!=-1) return dp[idx][sum+1000];

        int v1= func(nums,t,idx+1,sum+nums[idx],dp);
        int v2= func(nums,t,idx+1,sum-nums[idx],dp);
        dp[idx][sum+1000]= v1+v2;
        return v1+v2;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int dp[][]= new int [nums.length][2000+2];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return func(nums,target,0,0,dp);
    }
}