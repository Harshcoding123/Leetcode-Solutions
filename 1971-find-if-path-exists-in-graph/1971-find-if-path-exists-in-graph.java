class Solution {
    public boolean validPath(int n, int[][] edges, int s, int d) {
        ArrayList<Integer>graph[]= new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]= new ArrayList<>();
        }
        for(int i=0;i<edges.length;i++){
            int st =edges[i][0];
            int dest= edges[i][1];
            graph[st].add(dest);
            graph[dest].add(st);
        }
        boolean vis[]= new boolean[n];
       
            
                Queue<Integer>q =new LinkedList<>();
                q.add(s);
                while(q.size()>0){
                    int curr= q.remove();
                    if(curr==d) return true;
                    vis[curr]= true;
                    for(int i=0;i<graph[curr].size();i++){
                        int e= graph[curr].get(i);
                        if(!vis[e]){
                            q.add(e);
                            vis[e] =true;
                        }
                    }
                }
                return false;
            
    }
}