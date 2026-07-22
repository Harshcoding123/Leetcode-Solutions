class Solution {
    public int numPairsDivisibleBy60(int[] t) {
        HashMap<Integer,Integer>mp =new HashMap<>();
        int ans=0;
        for(int i=0;i<t.length;i++){
            int r =t[i]%60;
            int v= 60-r;
            if(r==0) v=0;
            if(mp.containsKey(v)) ans+=mp.get(v);
            if(!mp.containsKey(r)) mp.put(r,1);
            else mp.put(r,mp.get(r)+1);

        }
        return ans;
        
    }
}