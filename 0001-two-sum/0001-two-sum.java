class Solution {
    public int[] twoSum(int[] nums, int t) {
        HashMap<Integer,Integer>mp= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(t-nums[i])){
                return new int[]{mp.get(t-nums[i]),i};
            }
            if(!mp.containsKey(nums[i])) mp.put(nums[i],i);
            

        }
        return new int[]{-1};
    }
}