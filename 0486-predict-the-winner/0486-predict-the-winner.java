class Solution {
    int func(int nums[],int l,int r){
        if(l==r) return nums[l];
        int left= nums[l]-func(nums,l+1,r);
        int right= nums[r]-func(nums,l,r-1);
        return Math.max(left,right);
    }
    public boolean predictTheWinner(int[] nums) {
        int v=func(nums,0,nums.length-1);
        if(v>=0) return true;
        return false;
    }
}