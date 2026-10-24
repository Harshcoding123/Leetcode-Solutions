class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int s[]= new int [n];
        s[n-1] =nums[n-1];
        for(int i=n-2;i>=0;i--){
            s[i]= nums[i]*s[i+1];
        }
        int p=1;
        int a[]= new int[nums.length];
        
        for(int i=0;i<n;i++){
            if(i+1<n) a[i] =p*s[i+1];
           else  a[i]= p;
            p*=nums[i];
        }
        return a;
        
    }
}