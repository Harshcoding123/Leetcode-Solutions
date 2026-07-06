class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>mp= new HashMap<>();
        mp.put(0,-1);
        int ans=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int r =sum%k;
            if(r<0) r+=k;
            if(mp.containsKey(r)){
            if(i-mp.get(r)>=2) return true;
            }
           if(!mp.containsKey(r)) mp.put(r,i);
           

        }
        return false;
        

    }
}