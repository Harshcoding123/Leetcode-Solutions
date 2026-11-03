class Solution {
    public int majorityElement(int[] nums) {
        int n =nums.length/2;
        HashMap<Integer,Integer>mp =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!mp.containsKey(nums[i])) mp.put(nums[i],1);
            else mp.put(nums[i],mp.get(nums[i])+1);
            if(mp.get(nums[i])>n) return nums[i];
        }
        return -1;
    }
}