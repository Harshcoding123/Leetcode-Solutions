class Solution {
    void func(int [][]g,int curr,boolean vis[],List<Integer>a,boolean path[]){
        vis[curr] =true;
        boolean check =true;
        // if(g[curr].length==0) {
        //     path[curr] =true;
        //     check =true;
        // }
        for(int i=0;i<g[curr].length;i++){
            int e =g[curr][i];
            
            if(!vis[e]){
                func(g,e,vis,a,path);
            }
            if(!path[e]) check =false;
        }
        if(check){
            path[curr] =true;
             a.add(curr);
        }
        
    }
    public List<Integer> eventualSafeNodes(int[][] g) {
        ArrayList<Integer>a =new ArrayList<>();
        boolean vis[] =new boolean[g.length];
         boolean path[] =new boolean[g.length];
        
        for(int i=0;i<g.length;i++){
            if(!vis[i]){
                func(g,i,vis,a,path);
            }
        }
        Collections.sort(a);
        return a;
    }
}