class Solution {
    public int orangesRotting(int[][] g) {
        boolean check= false;int e1=0;int e2=0;
        Queue<int []>q =new LinkedList<>();
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                if(g[i][j]==1) e1 =1;
                if(g[i][j]==2) e2=1;
                if(g[i][j]==2) q.add(new int []{i,j});
            }
        }
       if(e1==0) return 0;
       if(e2==0) return -1;
        boolean vis[][]= new boolean [g.length][g[0].length];
        int c=-1;int n=q.size();int n1=0;
        while(q.size()>0){
            c++;
            for(int k=1;k<=n;k++){
                int a[] =q.remove();
                int i =a[0];int j =a[1];
                g[i][j]= 2;
                if(i+1<g.length&&g[i+1][j]==1){
                    n1++;
                    // vis[i+1][j]= true;
                    g[i+1][j]=2;
                    q.add(new int[]{i+1,j});
                }
                 if(i-1>=0&&g[i-1][j]==1){
                    n1++;
                    // vis[i-1][j]= true;
                    g[i-1][j]=2;
                    q.add(new int[]{i-1,j});
                }
                 if(j+1<g[0].length&&g[i][j+1]==1){
                    n1++;
                    // vis[i][j+1]= true;
                    g[i][j+1]=2;
                    q.add(new int[]{i,j+1});
                }
                 if(j-1>=0&&g[i][j-1]==1){
                    n1++;
                    // vis[i][j-1]= true;
                    g[i][j-1]=2;
                    q.add(new int[]{i,j-1});
                }
            }
            n=n1;
            n1=0;
        }
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                if(g[i][j]==1) return -1;
            }
        }
        return c;

        
    }
}