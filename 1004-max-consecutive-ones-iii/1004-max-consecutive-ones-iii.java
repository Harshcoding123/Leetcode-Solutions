class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;int idx=0;int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) idx++;
            while(idx>k){
                if(nums[l]==0) idx--;
                l++;
            }
            int w =i-l+1;
            ans= Math.max(ans,w);
        }
        return ans;
        
    }
}