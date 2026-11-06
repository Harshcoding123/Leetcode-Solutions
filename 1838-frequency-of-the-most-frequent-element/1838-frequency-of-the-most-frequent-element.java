class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long p=0;
        int l=0;int ans=0;
        for(int i=0;i<nums.length;i++){
            p+=nums[i];
            
            int n =nums[i]*(i-l+1);
            
            while(l<=i&&(((long)nums[i]*(i-l+1))-p)>k){
                p-=nums[l];
                l++;
               
            }
            ans= Math.max(ans,(i-l+1));

        }
        return ans;
    }
}