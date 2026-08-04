class Solution {
    int func(int []p,int idx){
        if(idx>=p.length) return 0;
        int v= Integer.MAX_VALUE;
        for(int i=1;i<=idx+1;i++){
            int v1= func(p,idx+i)+p[idx];
            
            v = Math.min(v,v1);
        }
        int v2= func(p,idx+(idx+1)+1)+p[idx];
        v =Math.min(v,v2);
        return v;
    }
    public int minimumCoins(int[] p) {
        return func(p,0);
    }
}