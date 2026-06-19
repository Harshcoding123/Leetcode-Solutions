class Solution {
    public int maximumBags(int[] c, int[] r, int ar) {
        int d[]= new int[c.length];
        for(int i=0;i<d.length;i++){
            d[i]= c[i]-r[i];

        }
        Arrays.sort(d);
        int ans=0;
        for(int i=0;i<d.length;i++){
            if(d[i]==0) ans++;
            else if(d[i]<=ar){
                ar= ar-d[i];
                ans++;
            }else{
                break;
            }
        }
        return ans;
        
    }
}