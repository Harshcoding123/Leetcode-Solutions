class Solution {
    public long countCompleteDayPairs(int[] h) {
        HashMap<Integer,Integer>mp= new HashMap<>();
        int c=0;
        for(int i=0;i<h.length;i++){
            int r =h[i]%24;
            int v =24-r;
            if(r==0) v=0;
            if(mp.containsKey(v)) c+=mp.get(v);
            if(!mp.containsKey(r)) mp.put(r,1);
            else mp.put(r,mp.get(r)+1);
                
        }
        return c;
        
    }
}