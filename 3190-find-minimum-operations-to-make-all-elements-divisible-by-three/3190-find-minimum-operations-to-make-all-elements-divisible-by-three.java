class Solution {
    public int minimumOperations(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int n= nums[i];
            int c1=0;int c2=0;
            while(n%3!=0){
                n++;
                c1++;
            }
            n= nums[i];
            while(n%3!=0){
                n--;
                c2++;
            }
            ans+=Math.min(c1,c2);
        }
        return ans;
    }
}