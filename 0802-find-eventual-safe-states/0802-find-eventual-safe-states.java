class Solution {
    void func(int g[][],int curr,boolean vis[],HashSet<Integer>st,List<Integer>a){
        vis[curr]= true;boolean check=true;
        for(int i=0;i<g[curr].length;i++){
            int e=g[curr][i];
            if(!vis[e]) func(g,e,vis,st,a);
            if(!st.contains(e)) check= false;
        }
        if(check){
             a.add(curr);
             st.add(curr);
        }
    }
    
    public List<Integer> eventualSafeNodes(int[][] graph) {
        HashSet<Integer>st= new HashSet<>();
        List<Integer>a= new ArrayList<>();
        boolean vis[]= new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]) func(graph,i,vis,st,a);
        }
        Collections.sort(a);
        
        return a;
        
    }
}