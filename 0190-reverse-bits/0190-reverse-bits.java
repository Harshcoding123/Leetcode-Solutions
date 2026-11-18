class Solution {
    public int reverseBits(int n) {

        //6--110 -- 011;
        int r=0;
       for(int i=1;i<=32;i++){
        int v= n&1;
        r =r<<1;
       r= r|v;
       n=n>>1;

       }
       return r;


        
    }
}