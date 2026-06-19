class Solution {
    public int maximumUnits(int[][] b, int t) {
        Arrays.sort(b,(p,q)->Integer.compare(q[1],p[1]));
        int c=0;
        int u=0;
        for(int i=0;i<b.length;i++){
            if(c==t) break;
            int v =t-c;
           if(b[i][0]<=v){
            u+=(b[i][0]*b[i][1]);
            c+=b[i][0];
           }else{
            u+=(v*b[i][1]);
            c+=v;
           }
        }
        return u;
        
    }
}