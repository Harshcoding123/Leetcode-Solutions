class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int p=0;int ans=0;
        HashMap<Integer,Integer>mp =new HashMap<>();
        mp.put(0,1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0) p++;
            int n= p-k;
            if(mp.containsKey(n)) ans+=mp.get(n);

            if(!mp.containsKey(p)) mp.put(p,1);
            else mp.put(p,mp.get(p)+1);

        }
        return ans;
    }
}