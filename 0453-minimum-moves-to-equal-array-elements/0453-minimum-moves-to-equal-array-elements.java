class Solution {
    public int minMoves(int[] nums) {
        int min =0;
       Arrays.sort(nums);
       min= nums[0];int ans=0;
       for(int i=0;i<nums.length;i++){
        ans+=(nums[i]-min);
       }
       return ans;
    }
}