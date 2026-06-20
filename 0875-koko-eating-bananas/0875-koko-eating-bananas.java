class Solution {
    boolean func(int p[],int hr,long k){
        int h=0;
        for(int i=0;i<p.length;i++){
            if(p[i]%k==0) h+=(p[i]/k);
            else h+=((p[i]/k)+1);
        }
        if(h>hr) return false;
        return true;
    }
    public int minEatingSpeed(int[] p, int h) {
        long min=1;
        long max=0;
        for(int i=0;i<p.length;i++){
            max+=p[i];
        }
        long ans=0;
        while(min<=max){
            long k= (min+max)/2;
            boolean c= func(p,h,k);
            if(c){
                ans= k;
                max= k-1;
            }else{
                min= k+1;
            }

        }
        return (int)ans;
        
    }
}