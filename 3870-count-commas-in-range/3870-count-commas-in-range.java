class Solution {
    public int countCommas(int n) {
        if(n<1000) return 0;
        int v= n-1000;
        return v+1;
        
    }
}