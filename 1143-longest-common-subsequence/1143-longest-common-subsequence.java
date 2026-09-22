class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int m =s1.length();
        int n= s2.length();
        int t[][]= new int[m+1][n+1];
        for(int i=0;i<=m;i++){
           
            for(int j=0;j<=n;j++){
                if(i==0||j==0){
                    t[i][j] =0;
                    continue;
                }
                char ch1= s1.charAt(i-1);
                char ch2 =s2.charAt(j-1);
                if(ch1==ch2){
                    t[i][j] =1+t[i-1][j-1];
                }else{
                    t[i][j]= Math.max(t[i][j-1],t[i-1][j]);
                }
            }
        }
        return t[m][n];
        
    }
}