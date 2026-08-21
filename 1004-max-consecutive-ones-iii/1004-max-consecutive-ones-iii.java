class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans=0;
        int e=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) e++;
            while(e>k){
                if(nums[l]==0) e--;
                l++;
            }
            ans= Math.max(ans,i-l+1);
        }
        return ans;
        
    }
}