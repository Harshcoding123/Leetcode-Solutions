class Solution {
    public int largestAltitude(int[] g) {
        int max=0;int ans=0;
        for(int i=0;i<g.length;i++){
            ans+=g[i];
            max =Math.max(ans,max);
        }
        return max;

        
    }
}