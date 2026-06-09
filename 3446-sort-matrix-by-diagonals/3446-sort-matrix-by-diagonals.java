class Solution {
    public int[][] sortMatrix(int[][] g) {
        int m=g.length;
        int n =g[0].length;
        int j =n-1;
        while(j>0){
            ArrayList<Integer>a =new ArrayList<>();
            int r=0; int c=j;
            while(c<n&&r<m){
                a.add(g[r][c]);
                c++;r++;
            }
            Collections.sort(a);
            r=0;c=j;int idx=0;
             while(c<n&&r<m){
               g[r][c] =a.get(idx++);
                c++;r++;
            }
            j--;
        }
        int i=0;
        while(i<m){
             ArrayList<Integer>a =new ArrayList<>();
             int r=i;int c=0;
            
             while(r<m&&c<n){
                a.add(g[r][c]);
                r++;c++;
             }
              Collections.sort(a);
               int idx= a.size()-1;
              c=0;r=i;
         while(r<m&&c<n){
               
                g[r][c]= a.get(idx--);
                r++;c++;
             }

             i++;
        }
       return g;

    }
}