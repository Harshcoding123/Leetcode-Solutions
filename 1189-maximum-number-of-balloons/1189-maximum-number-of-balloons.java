class Solution {
    public int maxNumberOfBalloons(String t) {
        HashMap<Character,Integer>mp= new HashMap<>();
        HashMap<Character,Integer>mpt= new HashMap<>();
        mp.put('b',1);
        mp.put('a',1);
        mp.put('l',2);
        mp.put('o',2);
        mp.put('n',1);
        for(int i=0;i<t.length();i++){
            char ch= t.charAt(i);
            if(!mpt.containsKey(ch)) mpt.put(ch,1);
            else mpt.put(ch,mpt.get(ch)+1);
        }
        int ans=-1;
        for(var i:mp.keySet()){
            if(!mpt.containsKey(i)) return 0;
            int val= mpt.get(i);
            if(val<mp.get(i)) return 0;
            int v =val/mp.get(i);
            // if(v==0) return 0;
            if(ans==-1||v<ans) ans= v;
            
        }
        return ans;
        
    }
}