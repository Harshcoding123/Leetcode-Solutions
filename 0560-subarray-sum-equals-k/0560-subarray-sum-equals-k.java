class Solution {
    public int subarraySum(int[] nums, int k) {
        int p[]=new int[nums.length];
        p[0]= nums[0];
        for(int i=1;i<nums.length;i++){
            p[i] =nums[i]+p[i-1];
        }
        HashMap<Integer,Integer>mp= new HashMap<>();
        mp.put(0,1);
        int ans=0;
        for(int j=0;j<p.length;j++){
            int n=p[j]-k;
            if(mp.containsKey(n)){
                ans+=mp.get(n);
            }
            if(!mp.containsKey(p[j])) mp.put(p[j],1);
            else mp.put(p[j],mp.get(p[j])+1);
        }
        return ans;
        
    }
}