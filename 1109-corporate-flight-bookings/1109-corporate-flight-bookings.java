class Solution {
    public int[] corpFlightBookings(int[][] b, int n) {
        int f[] =new int[n];
        for(int i=0;i<b.length;i++){
            int st =b[i][0]-1;
            int end= b[i][1]-1;
            int s= b[i][2];
            f[st] +=s;
            if(end+1<f.length) f[end+1]-=s;
        }
        int ans[] =new int[n];int s=0;
        for(int i=0;i<f.length;i++){
            s+=f[i];
            ans[i]= s;
        }
        return ans;
        
    }
}