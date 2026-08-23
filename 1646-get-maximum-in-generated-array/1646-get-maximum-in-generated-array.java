class Solution {
    public int getMaximumGenerated(int n) {
        if(n==0) return 0;
        int a[] =new int[n+1];int ans=0;
        a[0]= 0;
        a[1] =1;
        ans =1;
        for(int i=2;i<a.length;i++){
            if(i%2!=0){
                int idx= (i-1)/2;
                a[i]= a[idx]+a[idx+1];
            }else{
                int idx= i/2;
                a[i]= a[idx];
            }
            ans =Math.max(ans,a[i]);
        }
        return ans;
        
        
    }
}