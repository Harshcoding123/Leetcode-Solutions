class Solution {
    boolean func(char [][]g,int i,int j,boolean vis[][],char ch,int p1,int p2){
        if(i<0||i>=g.length||j<0||j>=g[0].length) return false;
        if(g[i][j]!=ch) return false;
        vis[i][j]= true;
        
        boolean v1= false;
        boolean v2= false;
        boolean v3= false;
        boolean v4= false;
        if((i+1<g.length)&&(i+1!=p1||j!=p2) && g[i+1][j]==ch){
            
            if(vis[i+1][j]) v1 =true;
            else v1= func(g,i+1,j,vis,ch,i,j);
        }
        if((i-1>=0)&&(i-1!=p1||j!=p2) && g[i-1][j]==ch){
            
            if(vis[i-1][j]) v2 =true;
            else v2= func(g,i-1,j,vis,ch,i,j);
        }
        if((j+1<g[0].length)&&(i!=p1||j+1!=p2) && g[i][j+1]==ch){
            
            if(vis[i][j+1]) v3 =true;
            else v3= func(g,i,j+1,vis,ch,i,j);
        }
         if((j-1>=0)&&(i!=p1||j-1!=p2) && g[i][j-1]==ch){
            
            if(vis[i][j-1]) v4 =true;
            else v4= func(g,i,j-1,vis,ch,i,j);
        }
         
         return v1||v2||v3||v4;

    }
    public boolean containsCycle(char[][] g) {
        boolean vis[][] =new boolean [g.length][g[0].length];
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                if(!vis[i][j]){
                    boolean v= func(g,i,j,vis,g[i][j],-1,-1);
                    if(v) return true;
                }
            }
        }
        return false;
    }
}