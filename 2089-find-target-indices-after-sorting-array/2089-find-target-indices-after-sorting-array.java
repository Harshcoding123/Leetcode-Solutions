class Solution {
    public List<Integer> targetIndices(int[] nums, int t) {
        ArrayList<Integer>a =new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==t) a.add(i);
        }
        
        return a;
    }
}