class Solution {
    public void rotate(int[] nums, int k) {
        k =k%nums.length;
        int n= nums.length;
        int ans[]= new int[n];
        int idx=0;
        for(int i=n-k;i<n;i++){
            ans[idx++]= nums[i];
        }
        for(int i=0;i<n-k;i++){
            ans[idx++] =nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]= ans[i];
        }
        
    }
}