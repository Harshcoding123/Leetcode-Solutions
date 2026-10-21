class Solution {
    void swap(int []nums,int i,int j){
        int t= nums[i];
        nums[i]= nums[j];
        nums[j]= t;
    }
    public void sortColors(int[] nums) {
        int i=0;int mid =0;int j=nums.length-1;
        while(mid<=j){
            if(nums[mid]==0) {
              swap(nums,i,mid);
              i++;mid++;
            }
            else if(nums[mid]==2){
                swap(nums,mid,j);
                j--;
            }
            else mid++;
            
        }
        
    }
}