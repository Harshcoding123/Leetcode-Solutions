class Solution {
    public int winningPlayerCount(int n, int[][] p) {
        Arrays.sort(p,(a,b)->Integer.compare(a[0],b[0]));
        int c=-1; int count=0;
        for(int i=0;i<p.length;i++){
            if(p[i][0]!=c){
                c =p[i][0];
                int idx =i;
                int f[]= new int [11];
                while(idx<p.length&&c==p[idx][0]){
                    f[p[idx][1]]++;
                    idx++;
                }
                int ans=0;
                for(int j=0;j<=10;j++){
                    ans= Math.max(ans,f[j]);
                }
                if(p[i][0]+1<=ans) count++;
                i= idx-1;

            }
        }
        return count;
        
    }
}