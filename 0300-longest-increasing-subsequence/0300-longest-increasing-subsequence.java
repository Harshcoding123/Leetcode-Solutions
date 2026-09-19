class Solution {
    int func(int []nums,int idx,int p,int [][]dp){
        if(idx>=nums.length) return 0;
        if(dp[idx][p+1]!=-1) return dp[idx][p+1];
        int skip= func(nums,idx+1,p,dp);
        int take =0;
        
        if(p==-1||nums[idx]>nums[p]){
            take =func(nums,idx+1,idx,dp)+1;
            
            dp[idx][p+1]= Math.max(skip,take);
            return dp[idx][p+1];
        }else{
            dp[idx][p+1]= skip;
            return dp[idx][p+1];
        }
    }
    public int lengthOfLIS(int[] nums) {
        int dp[][]= new int [nums.length][nums.length+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
    return func(nums,0,-1,dp);
    }
}