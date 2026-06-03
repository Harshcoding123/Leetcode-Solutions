class Solution {
    boolean func(int [][]g,int curr,boolean vis[],int c,HashMap<Integer,Integer>mp){
        if(c==1) c=0;
        else c=1;
        vis[curr] =true;
        mp.put(curr,c);
        for(int i=0;i<g[curr].length;i++){
            int e= g[curr][i];
            if(vis[e]){
                if(mp.get(e)==c) return false;
            }else{
                boolean v = func(g,e,vis,c,mp);
                if(!v) return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] g) {
        HashMap<Integer,Integer>mp =new HashMap<>();
        boolean vis[] =new boolean[g.length];
        for(int i=0;i<g.length;i++){
            if(!vis[i]){
                boolean v= func(g,i,vis,0,mp);
                if(!v) return false;
            }
        }
        return true;
    }
}