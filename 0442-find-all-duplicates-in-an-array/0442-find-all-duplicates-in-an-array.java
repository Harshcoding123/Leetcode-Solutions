class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer>a =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int d =Math.abs(nums[i]);
            if(nums[d-1]<0) a.add(Math.abs(nums[i]));
            else{
                nums[d-1]=0-nums[d-1];
            }
        }
        return a;
    }
}