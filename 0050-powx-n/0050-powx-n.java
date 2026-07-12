class Solution {
    double f(double x,int n){
        if(n==0) return 1;
        if(n==1) return x;
        double v =f(x,n/2);
        if(n%2==0) return v*v;
        else return v*v*x;
    }
    public double myPow(double x, int n) {
        if(n<0){
            x =1/x;
            n=-n;
        } 
        return f(x,n);

        
    }
}