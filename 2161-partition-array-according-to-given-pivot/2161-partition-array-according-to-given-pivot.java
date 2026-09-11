class Solution {
    public int[] pivotArray(int[] nums, int p) {
     ArrayList<Integer>a1= new ArrayList<>();   
     ArrayList<Integer>a2= new ArrayList<>();   
     int f=0;
     for(int i=0;i<nums.length;i++){
        if(nums[i]<p) a1.add(nums[i]);
        else if(nums[i]>p) a2.add(nums[i]);
        else f++;
     }
     int idx=0;
     for(int i=0;i<a1.size();i++){
        nums[idx++] =a1.get(i);
     }
     for(int i=1;i<=f;i++){
        nums[idx++] =p;
     }
     for(int i=0;i<a2.size();i++){
        nums[idx++] =a2.get(i);
     }
     return nums;
    }
}