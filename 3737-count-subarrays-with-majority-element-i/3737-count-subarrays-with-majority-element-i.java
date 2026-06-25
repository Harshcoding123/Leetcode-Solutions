class Solution {
    public int countMajoritySubarrays(int[] nums, int t) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            
            int c=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==t)c++;
                int l= j-i+1;
                if(c>l/2) ans++;
            }
        }
        return ans;

        
    }
}