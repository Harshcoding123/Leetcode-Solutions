class Solution {
    boolean func(ArrayList<ArrayList<Integer>>g,int curr,boolean vis[],ArrayList<Integer>a,boolean path[]){

        vis[curr] =true;
        path[curr]= true;
        
        for(int i=0;i<g.get(curr).size();i++){
            int e =g.get(curr).get(i);
            if(!vis[e]){
                if(! func(g,e,vis,a,path)) return false;
            }
            else{

               if(path[e]){

               a =new ArrayList<>();
                return false;
               }
            }
        }
        path[curr] =false;
        a.add(curr);
        return true;

    }
    public int[] findOrder(int n, int[][] pq) {
        ArrayList<ArrayList<Integer>>g=new ArrayList<>();
        for(int i=0;i<n;i++){
            g.add(new ArrayList<>());
        }
        for(int i=0;i<pq.length;i++){
            g.get(pq[i][0]).add(pq[i][1]);
        }
        boolean vis[] =new boolean[n];
        boolean path[]= new boolean[n];
        ArrayList<Integer>a= new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(!vis[i]){
                if(!func(g,i,vis,a,path)) return new int[0];
            }
           
        }
        int ans[] =new int[a.size()];
        for(int i=0;i<a.size();i++){
            ans[i]= a.get(i);
        }
        return ans;
        

    }
}