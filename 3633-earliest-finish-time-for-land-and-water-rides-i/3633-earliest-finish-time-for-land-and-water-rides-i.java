class Solution {
    public int earliestFinishTime(int[] l, int[] ld, int[] w, int[] wd) {
        int ans =Integer.MAX_VALUE;;
        for(int i=0;i<l.length;i++){
            int tl = l[i]+ld[i];
            for(int j=0;j<w.length;j++){
               int tw= w[j]+wd[j];
               if(w[j]<tl) ans = Math.min(ans,tl+wd[j]);
               else ans =Math.min(ans,tw);

               if(tw>l[i]) ans= Math.min(ans,tw+ld[i]);
               else ans =Math.min(ans,tl);

            }
        }
        return ans;
    }
}