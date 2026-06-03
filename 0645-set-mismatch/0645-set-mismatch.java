class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer>st =new HashSet<>();
        for(int i=1;i<=nums.length;i++){
            st.add(i);
        }
        int ans[] =new int[2];
        for(int i=0;i<nums.length;i++){
            if(st.contains(nums[i])) st.remove(nums[i]);
            else ans[0] =nums[i];
        }
        for(var i:st){
            ans[1] =i;
        }
        return ans;
    }
}