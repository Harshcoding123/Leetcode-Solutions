class Solution {
    public int subarraySum(int[] nums, int k) {
        // int p[]=new int[nums.length];
        // p[0]= nums[0];
        // for(int i=1;i<nums.length;i++){
        //     p[i] =nums[i]+p[i-1];
        // }
        int p=0;
        HashMap<Integer,Integer>mp= new HashMap<>();
        mp.put(0,1);
        int ans=0;
        for(int j=0;j<nums.length;j++){
            p+=nums[j];
            int n=p-k;
            if(mp.containsKey(n)){
                ans+=mp.get(n);
            }
            if(!mp.containsKey(p)) mp.put(p,1);
            else mp.put(p,mp.get(p)+1);
        }
        return ans;
        
    }
}