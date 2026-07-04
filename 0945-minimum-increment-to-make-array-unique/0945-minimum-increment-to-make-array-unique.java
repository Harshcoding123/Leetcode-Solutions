class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer>st= new HashSet<>();
        int c=0;int ans=0;
        for(int i=0;i<nums.length;i++){
            if(!st.contains(nums[i])){
            st.add(nums[i]);
            c= nums[i];

        }else{
            c =c+1;
            ans+=(c-nums[i]);
            st.add(c);
        }
        }
        return ans;
        
        
        
    }
}