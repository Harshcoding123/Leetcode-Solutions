class Solution {
    public int minimizeSum(int[] nums) {
        int n =nums.length;
        Arrays.sort(nums);
        // int []a= new int[nums.length];
        // for(int i=0;i<n;i++){
        //     a[i]= nums[i];
        // }
        // Arrays.sort(a);
        int v1 =Math.abs(nums[2]-nums[n-1]);
        int v2 =Math.abs(nums[0]-nums[n-3]);
        int v3 =Math.abs(nums[1]-nums[n-2]);
        // nums[0]= nums[n-1];
        // nums[1] =nums[n-1];
        // int v1= Math.abs(nums[2]-nums[n-1]);
        // a[n-1] =a[0];
        // a[n-2]= a[0];
        // int v2 =Math.abs(a[n-3]-a[0]);
        
        return Math.min(v1,Math.min(v2,v3));
    }
}