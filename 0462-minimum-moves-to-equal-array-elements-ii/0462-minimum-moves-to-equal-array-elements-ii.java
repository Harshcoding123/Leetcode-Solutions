class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int m=0;
        int n =nums.length;
        if(n>0){
            m= nums[n/2];
            

        }else{
            int v1 =n/2;
            int v2= n/2-1;
            m =(nums[v1]+nums[v2])/2;

        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=(Math.abs(m-nums[i]));
        }
        return ans;
    }
}