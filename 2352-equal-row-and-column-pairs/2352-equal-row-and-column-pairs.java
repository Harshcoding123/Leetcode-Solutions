class Solution {
    public int equalPairs(int[][] g) {
        HashMap<String,Integer>mp= new HashMap<>();
        for(int i=0;i<g.length;i++){
            String s =Arrays.toString(g[i]);
            if(!mp.containsKey(s)){
                 mp.put(s,1);
            }
            else mp.put(s,mp.get(s)+1);
        }
        int ans=0;
        for(int j=0;j<g[0].length;j++){
            int a[] =new int[g.length];
            for(int i=0;i<g.length;i++){
                a[i]=g[i][j];
            }
            String s =Arrays.toString(a);
            if(mp.containsKey(s)) ans+=mp.get(s);
        }
        return ans;
        
    }
}