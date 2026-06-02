class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[] =new int[2*n];
        int idx=0;
        for(int i=0;i<n;i++){
            a[idx]= nums[i];
            a[idx+1] =nums[i+n];
            idx+=2;;

        }
        return a;
        
    }
}