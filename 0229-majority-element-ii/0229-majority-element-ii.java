class Solution {
    public List<Integer> majorityElement(int[] nums) {
     int n= nums.length/3;
     ArrayList<Integer>a= new ArrayList<>();
     HashMap<Integer,Integer>mp= new HashMap<>();
     for(int i=0;i<nums.length;i++){
        if(!mp.containsKey(nums[i])) mp.put(nums[i],1);
        else mp.put(nums[i],mp.get(nums[i])+1);
        if(mp.get(nums[i])==n+1) a.add(nums[i]);
     }   
     return a;
    }
}