class Solution {
    boolean func(int[][] graph,int curr,char ch,boolean vis[],char[]c){
        vis[curr]= true;
        
        if(ch=='r') c[curr]= 'w';
        else c[curr]= 'r';
        for(int i=0;i<graph[curr].length;i++){
            int e= graph[curr][i];
            if(!vis[e]){
                if(!func(graph,e,c[curr],vis,c)) return false;
            }else{
                if(c[curr]==c[e]) return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        boolean vis[]= new boolean [graph.length];
        char c[]= new char[graph.length];
        for(int i=0;i<graph.length;i++){
            
            if(!vis[i]){
                if(!func(graph,i,'w',vis,c)) return false;
            }
        }
        return true;
    }
}