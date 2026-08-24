class Solution {
    int func(String t1,String t2,int i,int j,int[][]dp){

        if(i>=t1.length()||j>=t2.length()) return 0;
        char ch1 =t1.charAt(i);
        char ch2 =t2.charAt(j);
        if(dp[i][j]!=-1) return dp[i][j];
        
        if(ch1==ch2) return func(t1,t2,i+1,j+1,dp)+1;
        
           int v1 =func(t1,t2,i+1,j,dp);
           int v2= func(t1,t2,i,j+1,dp);
            dp[i][j]= Math.max(v1,v2);
            return dp[i][j];
        
    }
    public int longestCommonSubsequence(String t1, String t2) {
        int dp[][] =new int[t1.length()][t2.length()];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return func(t1,t2,0,0,dp);

    }
}