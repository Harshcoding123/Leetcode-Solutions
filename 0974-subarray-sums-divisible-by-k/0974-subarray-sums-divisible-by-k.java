class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int p=0;int ans=0;
        HashMap<Integer,Integer>mp =new HashMap<>();
        mp.put(0,1);
        for(int i=0;i<nums.length;i++){
            p+=nums[i];

            int r =(p%k+k)%k;
            if(mp.containsKey(r)) ans+=mp.get(r);

            if(!mp.containsKey(r)) mp.put(r,1);
            else mp.put(r,mp.get(r)+1);
        }
        return ans;

    }
}