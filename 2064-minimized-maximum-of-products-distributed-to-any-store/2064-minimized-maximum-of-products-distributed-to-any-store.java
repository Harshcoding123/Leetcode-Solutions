class Solution {
    boolean func(int n,int k,int []q){
        int s=0;
        for(int i=0;i<q.length;i++){
            if(q[i]%k==0){
                s+=(q[i]/k);
            }else{
                s+=(q[i]/k)+1;
            }
            if(s>n) return false;
            
        }
        return true;
    }
    public int minimizedMaximum(int n, int[] q) {
        int max= q[0];
        for(int i=0;i<q.length;i++){
            max =Math.max(max,q[i]);
        }
        int  min= 1;
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