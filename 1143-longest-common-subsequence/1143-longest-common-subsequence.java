class Solution {
    int func(String s1,String s2,int i,int j,int dp[][]){
        if(i>=s1.length()||j>=s2.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)) {
            return func(s1,s2,i+1,j+1,dp)+1;
        }
            int v1 =func(s1,s2,i+1,j,dp);
            int v2 =func(s1,s2,i,j+1,dp);
            dp[i][j]= Math.max(v1,v2);
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