class Solution {
    int func(String s,String t,int i,int j,int dp[][]){
        if(j>=t.length()) return 1;
        if(i>=s.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        char ch1 =s.charAt(i);
        char ch2 =t.charAt(j);
        if(ch1==ch2){
            int v1= func(s,t,i+1,j+1,dp);
            int v2 =func(s,t,i+1,j,dp);
            dp[i][j]= v1+v2;
            return dp[i][j];
        }else{
            dp[i][j] = func(s,t,i+1,j,dp);
            return dp[i][j];
        }
    }
    public int numDistinct(String s, String t) {
        int dp[][]= new int[s.length()][t.length()];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
     return func(s,t,0,0,dp);   
    }
}