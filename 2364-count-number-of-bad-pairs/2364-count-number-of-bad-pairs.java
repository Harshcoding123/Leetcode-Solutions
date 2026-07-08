class Solution {
    public long countBadPairs(int[] nums) {
       
       long ans=0;
        HashMap<Integer,Integer>mp =new HashMap<>();
         
        for(int i=0;i<nums.length;i++){
            if(!mp.containsKey(nums[i]-i)){
                 mp.put(nums[i]-i,1);
            }else{
                ans+=mp.get(nums[i]-i);
                  mp.put(nums[i]-i,mp.get(nums[i]-i)+1);
                  
            }

        }
        long n= nums.length;
        long t= n*(n-1)/2;

        return t-ans;
        
    }
}