class Solution {
    void func(List<List<Integer>> a,int idx,boolean vis[]){
        vis[idx]= true;
        for(int i=0;i<a.get(idx).size();i++){
            int e =a.get(idx).get(i);
            if(!vis[e]){
                func(a,e,vis);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> a) {
        boolean vis[] =new boolean[a.size()];
        func(a,0,vis);
        for(int i=0;i<vis.length;i++){
            if(vis[i]==false) return false;
        }
        return true;
    }
}