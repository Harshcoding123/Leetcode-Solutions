class Solution {
    public boolean isGood(int[] nums) {
        int max =nums[0];
        HashMap<Integer,Integer>mp =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            max =Math.max(max,nums[i]);
            if(!mp.containsKey(nums[i])) mp.put(nums[i],1);
            else mp.put(nums[i],mp.get(nums[i])+1);
        }
        if(max+1!=nums.length) return false;
        for(int i=1;i<=max;i++){
            if(mp.size()==0) return false;
            if(i==max){
                if(!mp.containsKey(i)||mp.get(i)!=2) return false;
            } 
            else if(!mp.containsKey(i)||mp.get(i)!=1) return false;
        }
        return true;
    }
}