class Solution {
    int func(String s,int idx,int dp[]){
        if(idx>=s.length()) return 1;
        int v =3;int ans=0;
        int mod= 1000000000+7;
        if(dp[idx]!=-1) return dp[idx];
        if(s.charAt(idx)=='7'||s.charAt(idx)=='9') v=4;
        for(int i=idx;i<idx+v;i++){

            if(i<s.length()) ans= (ans+func(s,i+1,dp))%mod;
        }
        dp[idx]= ans;
        return dp[idx];
    }
    public int countTexts(String s) {
        long ans=1;
       int mod= 1000000000+7;
        char v =s.charAt(0);int l=0;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch!=v) {
                 int dp[] =new int[s.length()];
        Arrays.fill(dp,-1);
                ans =(ans*func(s.substring(l,i),0,dp))%mod;
                l =i;
                v =ch;
            }

        }
         int dp[] =new int[s.length()];
        Arrays.fill(dp,-1);
        ans= (ans*func(s.substring(l,s.length()),0,dp))%mod;
        return (int)ans;
        
    }
}