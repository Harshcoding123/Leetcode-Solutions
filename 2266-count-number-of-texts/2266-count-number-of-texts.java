class Solution {
    int func(String s,int idx,int dp[]){
        int mod=1000000000+7;
        int v= 3;
        if(idx>=s.length()) return 1;
        int ans=0;
        if(dp[idx]!=-1) return dp[idx];
        if(s.charAt(idx)=='7'||s.charAt(idx)=='9') v =4;
        for(int i=idx;i<idx+v;i++){
            if(i<s.length()&&s.charAt(idx)==s.charAt(i))
            ans = (ans+func(s,i+1,dp))%mod;
            else break;
        }
        dp[idx]= ans;
        return ans;
    }
    public int countTexts(String s) {
        int dp[] =new int[s.length()];
        Arrays.fill(dp,-1);
        return func(s,0,dp);
    }
}