class Solution {
    HashMap<Integer,ArrayList<Integer>>mp;
    Random r;

    public Solution(int[] nums) {
        mp= new HashMap<>();
        r= new Random();
        for(int i=0;i<nums.length;i++){
            if(!mp.containsKey(nums[i])){
                ArrayList<Integer>a= new ArrayList<>();
                mp.put(nums[i],a);
                a.add(i);
            }else{
                ArrayList<Integer>a= mp.get(nums[i]);
                a.add(i);
            }

        }
        
    }
    
    public int pick(int t) {
        ArrayList<Integer>a =mp.get(t);
        if(a.size()==1) return a.get(0);
            int idx =r.nextInt(a.size());
            return a.get(idx);
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */