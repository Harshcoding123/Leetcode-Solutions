class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer>mp =new HashMap<>();
            // int min =Integer.MAX_VALUE;
            int max= Integer.MIN_VALUE;
            
            for(int j= i;j<s.length();j++){
                char ch= s.charAt(j);
                if(!mp.containsKey(ch)) mp.put(ch,1);
                else mp.put(ch,mp.get(ch)+1);
                int min =Integer.MAX_VALUE;
                // min= Math.min(mp.get(ch),min);
                max =Math.max(mp.get(ch),max);
                for(var e:mp.keySet()){
                    min= Math.min(mp.get(e),min);
                }
                ans+=(max-min);

            }
        }
        return ans;
        
    }
}