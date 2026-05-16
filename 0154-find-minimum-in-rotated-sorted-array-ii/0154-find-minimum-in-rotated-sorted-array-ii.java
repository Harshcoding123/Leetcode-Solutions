class Solution {
    public int findMin(int[] nums) {
        int idx=-1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                idx =i;
                break;
            }
        }
        if(idx==-1) return nums[0];
        int i =0;int j= nums.length-1;int ans=0;
        while(i<=j){
            int mid =(i+j)/2;
            if(mid<=idx) i= mid+1;
            else{
                ans= nums[mid];
                j =mid-1;
            }
        }
        return ans;
    }
}