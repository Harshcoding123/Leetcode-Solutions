class Solution {
    class Edge{
        int src;
        int dest;
        int wt;
        Edge(int src,int dest,int wt){
            this.src =src;
            this.dest =dest;
            this.wt =wt;
        }
    }
    int func(ArrayList<Edge> []g,int curr,boolean vis[],boolean c[],int n){
        if(curr==n) c[0] =true;
        if(vis[curr]) return Integer.MAX_VALUE;
        vis[curr]= true;
        int ans= Integer.MAX_VALUE;
        for(int i=0;i<g[curr].size();i++){
            Edge e =g[curr].get(i);
            ans =Math.min(ans,e.wt);
            int v= func(g,e.dest,vis,c,n);
            ans =Math.min(ans,v);
        }
        return ans;
    }
    public int minScore(int n, int[][] r) {
        ArrayList<Edge> g[]= new ArrayList[n+1];
        for(int i=0;i<g.length;i++){
            g[i] =new ArrayList<Edge>();
        }
        for(int i=0;i<r.length;i++){
            int s= r[i][0];
            int d =r[i][1];
            int w= r[i][2];
            g[s].add(new Edge(s,d,w));
            g[d].add(new Edge(d,s,w));
        }
        boolean vis[]= new boolean[n+1];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                boolean c[] =new boolean[1];
                int v= func(g,i,vis,c,n);
                if(c[0]) return v;
            }
        }
        return -1;
    }
}


