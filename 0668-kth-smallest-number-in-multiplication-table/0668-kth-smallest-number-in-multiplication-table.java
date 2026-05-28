class Solution {
    public int findKthNumber(int m, int n, int k) {
        // int m[][]= new int[ml][n];
        // for(int i=0;i<ml;i++){
        //     for(int j=0;j<n;j++){
        //         m[i][j]= (i+1)*(j+1);
        //     }
        // }
         int l= 1;int h =m*n;
        while(l<h){
            int midv =l+(h-l)/2;
            int ans=0;
            for(int i=1;i<=m;i++){
                int st= 1;int end= n;
                int idx=-1;
                while(st<=end){
                    int mid =st+(end-st)/2;
                    if(i*mid>midv){
                        idx= mid;
                        end= mid-1;
                    }else{
                        st= mid+1;
                    }
                }
                // if(idx==-1) ans+=m[0].length-1;
                // else ans+=idx;
                ans+=(st-1);

            }
            // if(ans==k) return midv;
             if(ans>=k) h =midv;
            else l= midv+1;
        }
        return l;

        
    }
}