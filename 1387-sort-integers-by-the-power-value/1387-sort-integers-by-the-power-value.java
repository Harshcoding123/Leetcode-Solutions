class Solution {
    int func(int x){
        if(x==1) return 0;
        int v=0;
        if(x%2==0) v =x/2;
        else v= 3*x+1;
        int s =func(v);
        return s+1;
    }
    public int getKth(int lo, int hi, int k) {
        int a[][]= new int[hi-lo+1][2];
        int idx=0;
        for(int i=lo;i<=hi;i++){
            
            int v =func(i);
            a[idx][0] =i;
            a[idx][1]= v;
            idx++;
        }
        Arrays.sort(a,(p,b)->(p[1]-b[1]));
        return a[k-1][0];
        
    }
}