class Solution {
    double func(int nums[],int st,int k,double dp[][]){
        if(st>=nums.length&&k==0) return 0;
        if(k<=0&&st<nums.length) return Integer.MIN_VALUE;
        if(k>0&&st>=nums.length) return Integer.MIN_VALUE;
        
        double s=0;double c=0;double max= 0;
        if(dp[st][k]!=-1) return dp[st][k];
        if(k==1){
            for(int i=st;i<nums.length;i++){
                s+=nums[i]; c++;
            }
            double avg= s/c;
            dp[st][k] =avg;
        }
        for(int i= st;i<nums.length;i++){
            s+=nums[i];c++;
            double avg =s/c;
            double v= func(nums,i+1,k-1,dp)+avg;
            max =Math.max(max,v);
        }
        dp[st][k]= max;
        return dp[st][k];
    }
    public double largestSumOfAverages(int[] nums, int k) {
        double dp[][] =new double[nums.length][nums.length+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }

        return func(nums,0,k,dp);
        
    }
}