class Solution {
    public int longestSubarray(int[] nums) {
        int l=0;int ans=0;int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) idx++;
            while(idx>=2){
                if(nums[l]==0) idx--;
                l++;
            }
            ans= Math.max(ans,(i-l));
        }
        return ans;
    }
}