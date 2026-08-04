class Solution {
    int func(String s,int idx,int []dp){
        int mod=1000000000+7;
        if(idx>=s.length()) return 1;
        if(dp[idx]!=-1) return dp[idx];
        char ch =s.charAt(idx);
        int l=0;long v=0;
        if(ch=='7'||ch=='9') l= 4;
        else l=3;
        for(int i=idx;i<idx+l;i++){
           if(i<s.length()&&s.charAt(i)==s.charAt(idx)) v=(v+func(s,i+1,dp))%mod;
           else break;

        }
        dp[idx]= (int)v%mod;
        return dp[idx];

        
    }
    public int countTexts(String s) {
        int dp[] =new int[s.length()];
        Arrays.fill(dp,-1);
        return func(s,0,dp);

        
    }
}