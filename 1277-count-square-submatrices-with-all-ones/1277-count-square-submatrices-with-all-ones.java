class Solution {
    public int countSquares(int[][] mat) {
        int m =mat.length;
        int n= mat[0].length;
        int sum=0;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(mat[i][j]==0) continue;
                int v1 =mat[i][j-1];
                int v2= mat[i-1][j];
                int v3 =mat[i-1][j-1];
                int v= Math.min(v1,Math.min(v2,v3));
                mat[i][j] =v+1;
                sum+=mat[i][j];
            }
        }
        
        for(int j=0;j<n;j++){
            sum+=mat[0][j];
        }
        for(int i=1;i<m;i++){
            sum+=mat[i][0];
        }
        return sum;
    }
}