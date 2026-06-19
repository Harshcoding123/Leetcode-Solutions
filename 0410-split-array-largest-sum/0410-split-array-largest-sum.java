class Solution {
    public int splitArray(int[] w, int days) {
          int max =w[0];
        int sum=0;
        for(int i=0;i<w.length;i++){
            max= Math.max(max,w[i]);
            sum+=w[i];
        }

        int min =max;
         max =sum;
        int ans=0;
        while(min<=max){
            int mid =(max+min)/2;
            int c=mid;
            int d=0;int s=0;
            for(int i=0;i<w.length;i++){
                if(s+w[i]>c){
                    d++;
                    s=w[i];
                }else s+=w[i];
            }
            d++;
            if(d==days){
                ans =mid;
                max= mid-1;
            }else if(d<days){
                ans =mid;
                max= mid-1;
            }
            else min =mid+1;
        }
        return ans;
    }
}