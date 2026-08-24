class Solution {
    public int search(int[] nums, int t) {
        int i=0;int j= nums.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==t) return mid;
            if((nums[mid]>=nums[0]&&t>=nums[0])||(nums[mid]<nums[0]&&t<nums[0])) {
                if(nums[mid]>t) j= mid-1;
                else i= mid+1;
            }else{
                if(nums[mid]>t) i= mid+1;
                else j= mid-1;
            }
        }
        return -1;
    }
}