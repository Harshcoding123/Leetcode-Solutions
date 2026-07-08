class Solution {
    int rev(int n){
        int a=0;
        while(n>0){
            int r =n%10;
            a =a*10+r;
            n/=10;
        }
        return a;
    }
    public int countNicePairs(int[] nums) {
        HashMap<Integer,Integer>mp =new HashMap<>();
        int ans=0;
        int mod =1000000000+7;
        for(int i=0;i<nums.length;i++){
            int v= nums[i]-rev(nums[i]);
            
            if(!mp.containsKey(v)) mp.put(v,1);
            else{
                ans+=(mp.get(v));
                 mp.put(v,mp.get(v)+1);
                 
                 ans%=mod;

            }

        }
        return ans%=mod;
    }
}