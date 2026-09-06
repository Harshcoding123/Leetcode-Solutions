class Solution {
    public int miceAndCheese(int[] r1, int[] r2, int k) {
        int n= r1.length;
        int d[]= new int[n];
        int ans=0;
        for(int i=0;i<n;i++){
            d[i] =r1[i]-r2[i];
           ans+=r2[i];
        }
      
        
        Arrays.sort(d);
        for(int i=n-1;i>=0;i--){
             if(k<=0) break;
                ans+=d[i];
              k--;
             
            
        }
        return ans;
    }
}