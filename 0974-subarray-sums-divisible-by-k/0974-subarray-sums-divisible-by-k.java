class Solution {
    
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer>mp= new HashMap<>();
        int ans=0;int sum=0;
        mp.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int r =sum%k;
            if(r<0) r+=k;
            if(mp.containsKey(r)) ans+=mp.get(r);
            if(!mp.containsKey(r)) mp.put(r,1);
            else mp.put(r,mp.get(r)+1);
            
        }
        return ans;
        
    }
}