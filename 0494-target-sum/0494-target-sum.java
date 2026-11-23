class Solution {
    int func(int nums[],int t,int idx,int sum){
        if(idx==nums.length){
            if(sum==t) return 1;
            return  0;

            
        }
        int v1= func(nums,t,idx+1,sum+nums[idx]);
        int v2= func(nums,t,idx+1,sum-nums[idx]);
        return v1+v2;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return func(nums,target,0,0);
    }
}