class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0;
        long p=1;int ans=0;
        for(int i=0;i<nums.length;i++){
            p*=nums[i];
            while(p>=k&&l<=i){
                p/=nums[l];
                l++;
            }
            
            ans+=(i-l+1);
            
        }
        return ans;
    }
}