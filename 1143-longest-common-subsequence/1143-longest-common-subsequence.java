class Solution {
    int func(String s1,String s2,int i,int j,int dp[][]){
        if(i>=s1.length()||j>=s2.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
             dp[i][j]= func(s1,s2,i+1,j+1,dp)+1;
             return dp[i][j];
        }
        dp[i][j]= Math.max(func(s1,s2,i+1,j,dp),func(s1,s2,i,j+1,dp));
        return dp[i][j];
    }
    public int longestCommonSubsequence(String s1, String s2) {
        int dp[][] =new int[s1.length()][s2.length()];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return func(s1,s2,0,0,dp);
    }
}