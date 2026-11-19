class Solution {
    boolean func(int n){
        if(n<2) return false;
        if(n%2!=0) return false;
        if(n==2) return true;
        boolean v =func(n/2);
        if(v) return true;
        return false;
    }
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        return func(n);
    }
}