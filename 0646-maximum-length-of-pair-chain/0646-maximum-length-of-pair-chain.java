class Solution {
    int solve(int [][]pair,int idx,int p,int dp[][]){
        
        if(idx>=pair.length) return 0;
        if(dp[idx][p+1]!=-1) return dp[idx][p+1]; 
        if(p!=-1&&pair[p][1]>=pair[idx][0]){  //skip
        dp[idx][p+1]=  solve(pair,idx+1,p,dp);
        return dp[idx][p+1];
        }else{
            int v1 =solve(pair,idx+1,idx,dp)+1;
            int v2= solve(pair,idx+1,p,dp);
            dp[idx][p+1]= Math.max(v1,v2);
            return dp[idx][p+1];

        }
    }
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->Integer.compare(a[0],b[0]));
        int dp[][]= new int[pairs.length][pairs.length+1];
        for(int i=0;i<pairs.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(pairs,0,-1,dp);
        
    }
}