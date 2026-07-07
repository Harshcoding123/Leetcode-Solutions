class Solution {
    public long sumAndMultiply(int n) {
        long x=0;long sum=0;long d=1;
        while(n>0){
            int r =n%10;
            if(r==0){
                n=n/10;
                continue;
            }
            sum+=r;
            x =(r*d)+x;
            d*=10;
            n/=10;
        }
        return x*sum;
        
    }
}