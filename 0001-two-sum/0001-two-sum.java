class Solution {
    public int[] twoSum(int[] nums, int t) {
        
         int a[] =new int[2];
        HashMap<Integer,Integer>mp= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int r =t-nums[i];
            if(mp.containsKey(r)){
                a[0] =mp.get(r);
                a[1] =i;
                return a;
            }
            if(!mp.containsKey(nums[i])) mp.put(nums[i],i);
            
        }
        return a;
    }
}