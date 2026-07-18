class Solution {
    int func(int nums[],int n,int t,int idx){
        if(idx>=nums.length){
            if(n==t) return 1;
            return 0;
        }
        int v1= func(nums,n+nums[idx],t,idx+1);
        int v2= func(nums,n-nums[idx],t,idx+1);
        return v1+v2;
    }
    public int findTargetSumWays(int[] nums, int t) {
        return func(nums,0,t,0);
    }
}