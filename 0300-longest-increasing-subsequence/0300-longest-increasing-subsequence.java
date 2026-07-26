class Solution {
    int func(int nums[],int idx,int p,int dp[][]){
        if(idx>=nums.length) return 0;
        if(dp[idx][p]!=-1) return dp[idx][p];
        if(p!=nums.length&&nums[idx]<=nums[p]){
             dp[idx][p]= func(nums,idx+1,p,dp);
             return dp[idx][p];
        } //skip
        
        int v1= func(nums,idx+1,p,dp); //skip
        
        int v2= func(nums,idx+1,idx,dp)+1; //take
        dp[idx][p]= Math.max(v1,v2);
        return dp[idx][p];
    }
    public int lengthOfLIS(int[] nums) {
        int dp[][]= new int[nums.length][nums.length+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return func(nums,0,nums.length,dp);
        
    }
}