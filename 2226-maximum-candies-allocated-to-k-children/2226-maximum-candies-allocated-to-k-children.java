class Solution {
    boolean func(int c[],long k,long mid){
        long n=0;
        for(int i=0;i<c.length;i++){
            n+=(c[i]/mid);
        }
        if(n>=k) return true;
        return false;
    }
    public int maximumCandies(int[] c, long k) {
        long min=1;
        long max= c[0];
        for(int i=0;i<c.length;i++){
            max= Math.max(max,c[i]);
        }
        long ans=0;
        while(min<=max){
            long mid=(min+max)/2;
            boolean check =func(c,k,mid);
            if(check){
                ans= mid;
                min =mid+1;
            }else{
                max= mid-1;
            }

        }
        return (int)ans;
    }
}