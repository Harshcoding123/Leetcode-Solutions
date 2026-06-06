class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n =nums.length;
        int suf[] =new int [n];
        suf[n-1]= nums[n-1];
        for(int i=n-2;i>=0;i--){
            suf[i]= nums[i]+suf[i+1];
        }
        int sum=0;
        for(int i=0;i<n-1;i++){
            int v= nums[i];
            nums[i]= Math.abs(sum-suf[i+1]);
            sum+=v;
        }
        nums[n-1] =sum;
        return nums;

    }
}