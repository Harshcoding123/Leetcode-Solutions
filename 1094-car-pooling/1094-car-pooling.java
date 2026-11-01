class Solution {
    public boolean carPooling(int[][] t, int c) {
        int f[]= new int[1000+1];
        for(int i=0;i<t.length;i++){
            f[t[i][1]]+=t[i][0];
            f[t[i][2]] -=t[i][0];
        }
        int s=0;
        for(int i=0;i<f.length;i++){
            s+=f[i];
            if(s>c) return false;
        }
        return true;
    }
}