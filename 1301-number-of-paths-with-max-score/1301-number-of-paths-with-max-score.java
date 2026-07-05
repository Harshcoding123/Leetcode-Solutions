class Solution {
    long path(int g[][],int i,int j,int s,int val,long dp[][][]){
        if(i<0||j<0||i>=g.length||j>=g[0].length) return 0;
        if(g[i][j]==-1) return 0;
        
        if(i==g.length-1&&j==g[0].length-1){
            if(s==val) return 1;
            else return 0;
        }
        int mod =1000000000 + 7;
        if(dp[i][j][s]!=-1) return dp[i][j][s];
        long v1 =path(g,i+1,j,s+g[i][j],val,dp);
        long v2= path(g,i,j+1,s+g[i][j],val,dp);
        long v3 =path(g,i+1,j+1,s+g[i][j],val,dp);
        dp[i][j][s]= (v1+v2+v3)%mod;
        return dp[i][j][s];
    }
    int max(int g[][],int i,int j,int c[],int dp[][]){
        if(i<0||j<0||i>=g.length||j>=g[0].length) return 0;
        if(i==g.length-1&&j==g[0].length-1) c[0] =1;
        if(g[i][j]==-1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int v1 =max(g,i+1,j,c,dp);
        int v2= max(g,i,j+1,c,dp);
        int v3 =max(g,i+1,j+1,c,dp);
        int v=Math.max(v1,v2);
        dp[i][j]= Math.max(v3,v)+g[i][j];
        return dp[i][j];
    }
    public int[] pathsWithMaxScore(List<String> b) {
        int g[][] =new int[b.size()][b.size()];
        for(int i=0;i<b.size();i++){
            String s =b.get(i);
            for(int j=0;j<s.length();j++){
                char ch= s.charAt(j);
                if(ch=='S'||ch=='E') g[i][j] =0;
                else if(ch=='X') g[i][j]=-1;
                else g[i][j] =(int)ch-'0';
            }
        }
        int dp[][]= new int[g.length][g[0].length];
        for(int i=0;i<g.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans[]= new int[2];
        int c[]= new int[1];
        c[0] =-1;
        int v1= max(g,0,0,c,dp);
        if(c[0]==-1){
            ans[0] =0;
            ans[0]= 0;
            return ans;
        }
         long dp2[][][]= new long[g.length][g[0].length][v1+1];
         for(int i=0;i<g.length;i++){
            for(int j=0;j<dp2[i].length;j++){
                Arrays.fill(dp2[i][j],-1);
            }
            
        }
        int v2 =(int)path(g,0,0,0,v1,dp2);
        ans[0] =v1;
        ans[1] =v2;
        return ans;
        
    }
}