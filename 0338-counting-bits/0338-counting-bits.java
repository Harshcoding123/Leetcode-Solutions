class Solution {
    public int[] countBits(int n) {
        int ans[] =new int[n+1];
        for(int i=0;i<=n;i++){

            int num= i;
            int c=0;
            while(num>0){
                int v= num&1;
                if(v==1) c++;
                num=num>>1;
            }
            ans[i]= c;


        }
        return ans;
        
    }
}