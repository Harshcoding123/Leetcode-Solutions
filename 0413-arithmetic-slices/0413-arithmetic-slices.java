class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int p=0;int l=1;int d=0;int ans=0;
        for(int i=1;i<nums.length;i++){
            if(l==1){
                d= nums[i]-nums[i-1];
                l++;
                continue;
            }
            if((nums[i]-nums[i-1])==d){
                l++;
            if(l>=3){
                p++;
                ans+=p;
            }
            }
            else{
                l=2;p=0;
                d= (nums[i]-nums[i-1]);
            }
        }
        return ans;
        
    }
}