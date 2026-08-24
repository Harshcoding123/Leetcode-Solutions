class Solution {
    public int removeDuplicates(int[] nums) {
        int idx=0;int c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[idx]!=nums[i]){
                c++;
                // int t =nums[idx+1];
                nums[idx+1]= nums[i];
                // nums[i]= t;
                idx++;
            }
        }
        return c;
    }
}