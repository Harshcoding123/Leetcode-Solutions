class Solution {
    double p(double x,long n){
        if(n==0||x==1) return 1;
        if(n==1) return x;
        if(n%2==0){
            double v= p(x,n/2);
            return v*v;
        }
        return p(x,n-1)*x;
    }
    public double myPow(double x, int n) {
        long v=n;
        if(n<0){
           
              v = Math.abs(v);
            return 1/p(x,v);
        }
        return p(x,v);
    }
}