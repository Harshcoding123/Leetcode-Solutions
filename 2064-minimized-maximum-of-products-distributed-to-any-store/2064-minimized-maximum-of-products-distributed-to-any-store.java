class Solution {
    boolean func(int n,int k,int []q){
       int idx =0;int c=1;
       while(idx<q.length){
        int v= q[idx];
        if(v<=k){
            idx++;c++;
        }else {
            while(v>0){
                v=v-k;
                c++;
                if(c>n+1) return false;
            }
            idx++;

        }

        if(c>n+1) return false;

       }
       if(c>n+1) return false;
       return true;

    }
    public int minimizedMaximum(int n, int[] q) {
        int max= q[0];
        for(int i=0;i<q.length;i++){
            max =Math.max(max,q[i]);
        }
        int  min= 0;
        int ans=0;
        while(min<=max){
            int k= (min+max)/2;
            boolean c = func(n,k,q);
            if(c){
                ans= k;
                max =k-1;
            }else min= k+1;
        }
        return ans;

    }
}