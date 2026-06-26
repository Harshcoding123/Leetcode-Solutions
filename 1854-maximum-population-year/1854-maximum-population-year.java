class Solution {
    public int maximumPopulation(int[][] logs) {
        int f[] =new int[101];
        for(int i=0;i<logs.length;i++){
            int st= logs[i][0];
            int end= logs[i][1];
            f[st-1950] +=1;
            f[end-1950]-=1;
        }
        int s=0;int ans=Integer.MAX_VALUE;int max=0;
        for(int i=0;i<f.length;i++){
            s+=f[i];
            if(s>max){
                max= s;
                ans= i+1950;
            }
        }
        return ans;
    }
}