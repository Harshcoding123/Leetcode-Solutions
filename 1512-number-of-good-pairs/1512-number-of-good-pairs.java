class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer>mp =new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(!mp.containsKey(nums[i])) mp.put(nums[i],1);
            else{
                ans+=(mp.get(nums[i]));
                mp.put(nums[i],mp.get(nums[i])+1);

            }
        }
        return ans;
    }
}