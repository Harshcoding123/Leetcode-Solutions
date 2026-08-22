class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
           int f[]= new int [26];
            // int min =Integer.MAX_VALUE;
            
            
            for(int j= i;j<s.length();j++){
                char ch= s.charAt(j);
                f[ch-'a']++;
                // if(!mp.containsKey(ch)) mp.put(ch,1);
                // else mp.put(ch,mp.get(ch)+1);
                int min =Integer.MAX_VALUE;
                int max= Integer.MIN_VALUE;
                // min= Math.min(mp.get(ch),min);
                // max =Math.max(mp.get(ch),max);
                // for(var e:mp.keySet()){
                //     min= Math.min(mp.get(e),min);
                // }
                for(int k=0;k<26;k++){
                    if(f[k]>0){
                        max= Math.max(max,f[k]);
                        min= Math.min(min,f[k]);
                    }
                }

                ans+=(max-min);

            }
        }
        return ans;
        
    }
}