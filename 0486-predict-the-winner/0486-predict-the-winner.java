class Solution {
    int func(int nums[],int i,int j){
        if(i>j) return 0;
        if(i==j) return nums[i];
        int take_1 =nums[i];
        int v1= func(nums,i+2,j);
        int v2= func(nums,i+1,j-1);
        int s1= take_1+Math.min(v1,v2);
        int take_2 =nums[j];
        int v3= func(nums,i+1,j-1);
        int v4 =func(nums,i,j-2);
        int s2= take_2+Math.min(v3,v4);
        return Math.max(s1,s2);
    }
    public boolean predictTheWinner(int[] nums) {
        int p1 =func(nums,0,nums.length-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int p2 =sum-p1;
        if(p1>=p2) return true;
        return false;
        
    }
}