class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Integer,Integer>mp= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!mp.containsKey(nums[i])) mp.put(nums[i],1);
            else mp.put(nums[i],mp.get(nums[i])+1);
        }
        int max=-1;
        for(var i:mp.keySet()){
            int idx= i;
            int ans=0;
            while(mp.containsKey(idx)&&mp.get(idx)>=2){
                ans+=2;
                idx*=idx;
            }
            if(ans>0){
                if(mp.containsKey(idx)) ans+=1;
                else ans-=1;
               if(ans%2!=0) max =Math.max(max,ans);
            }
        }
        if(max==-1) return 1;
        return max;

        
    }
}