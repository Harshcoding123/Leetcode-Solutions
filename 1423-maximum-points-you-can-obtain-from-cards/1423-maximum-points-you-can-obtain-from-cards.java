class Solution {
    public int maxScore(int[] cp, int k) {
        int ans=0;int max =-1;
        for(int i=0;i<k;i++){
            ans+=cp[i];
        }
        max= Math.max(max,ans);
        int end= cp.length-1;
        int idx= k-1;
        while(idx>=0){
            ans-=cp[idx--];
            ans+=(cp[end--]);
            max= Math.max(max,ans);
        }
        return max;
        
    }
}