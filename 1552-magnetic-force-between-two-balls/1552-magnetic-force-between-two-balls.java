class Solution {
    boolean func(int []p,int m,int mid){
        int c=1;int idx=0;
        for(int i=1;i<p.length;i++){
            int d =p[i]-p[idx];
            if(d>=mid){
                c++;idx= i;
            }
            if(c==m) break;

        }
        if(c<m) return false;
        return true;
    }
    public int maxDistance(int[] p, int m) {
        Arrays.sort(p);
        int min= 1;
        int max= p[p.length-1]-p[0];
        int ans=0;
        while(min<=max){
            int mid= (min+max)/2;
            boolean c =func(p,m,mid);
            if(c){
                ans= mid;
                min= mid+1;
            }else{
                max =mid-1;
            }

        }
        return ans;
        
    }
}