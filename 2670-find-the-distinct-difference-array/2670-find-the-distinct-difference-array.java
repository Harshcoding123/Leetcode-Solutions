class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        HashSet<Integer>st =new HashSet<>();
        HashSet<Integer>p =new HashSet<>();
        int n =nums.length;
        int suf[]= new int[n];
        // suf[n-1]= 1;
        // st.add(nums[n-1]);
        for(int i=n-1;i>=0;i--){
            st.add(nums[i]);
            suf[i] =st.size();

        }
        for(int i=0;i<n-1;i++){
            p.add(nums[i]);
            nums[i] = p.size()-suf[i+1];

        }
        p.add(nums[n-1]);
        nums[n-1]= p.size();
        return nums;



        
    }
}