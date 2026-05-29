class Solution {
    public int minElement(int[] nums) {
        int min= nums[0];
        for(int i=0;i<nums.length;i++){
            int n= nums[i];
            int s=0;
            while(n>0){
                s+=(n%10);
                n/=10;

            }
            nums[i]= s;
            min= Math.min(min,s);
        }
        return min;
        
    }
}