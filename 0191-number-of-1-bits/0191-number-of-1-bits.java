class Solution {
    public int hammingWeight(int n) {
        int ans=0;
        while(n>0){
            int v= n&1;
            if(v==1) ans++;
            n= n>>1;
        }
        return ans;
    }
}