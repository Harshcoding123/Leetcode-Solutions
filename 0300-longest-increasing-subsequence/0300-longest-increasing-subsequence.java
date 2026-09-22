class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0) return 0;
        int t[]= new int[nums.length];
        int max= 1;
        t[0]= 1;
        for(int i=1;i<t.length;i++){
            t[i] =1;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]) t[i] =Math.max(t[i],t[j]+1);
            }
            max =Math.max(t[i],max);
        }
        return max;
    }
}