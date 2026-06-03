class Solution {
    public double averageWaitingTime(int[][] c) {
        long ct=c[0][0];long avg= 0;
        for(int i=0;i<c.length;i++){
            if(ct>=c[i][0]){
                ct+=c[i][1];
                avg+=(ct-c[i][0]);
            }else{
                avg+=c[i][1];
                // v =c[i][0]-ct;
                ct =c[i][0]+c[i][1];


            }
        }
        double ans=(double) avg/c.length;
        return ans;
    }
}