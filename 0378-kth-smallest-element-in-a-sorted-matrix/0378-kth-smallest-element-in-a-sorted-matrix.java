class Solution {
    public int kthSmallest(int[][] m, int k) {
        int l= m[0][0];int h =m[m.length-1][m[0].length-1];
        while(l<h){
            int midv =l+(h-l)/2;
            int ans=0;
            for(int i=0;i<m.length;i++){
                int st= 0;int end= m[0].length-1;
                int idx=-1;
                while(st<=end){
                    int mid =st+(end-st)/2;
                    if(m[i][mid]>midv){
                        idx= mid;
                        end= mid-1;
                    }else{
                        st= mid+1;
                    }
                }
                // if(idx==-1) ans+=m[0].length-1;
                // else ans+=idx;
                ans+=st;

            }
            // if(ans==k) return midv;
             if(ans>=k) h =midv;
            else l= midv+1;
        }
        return l;


        
    }
}