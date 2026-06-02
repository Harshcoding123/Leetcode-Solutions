class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans= 0;
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0) continue;
            if(nums[i]==1) c++;
            if(nums[i+1]==0){
                ans= Math.max(ans,c);
                c=0;
            }
        }
        if(nums[nums.length-1]==1){
            c++;
            ans= Math.max(ans,c);
        }
        return ans;
    }
}