class Solution {
    boolean func(String s,HashSet<String>st,int idx,int dp[]){
        if(idx>=s.length()) return true;
        if(dp[idx]!=-1){
            if(dp[idx]==0) return false;
            else return true;
        }
        for(int i=idx;i<=s.length();i++){
            String sb= s.substring(idx,i);
            if(st.contains(sb)){
                if(func(s,st,i,dp)){
                    dp[idx] =1;
                    return true;
                }
            }
        }
        dp[idx]= 0;
        return false;
    }
    public boolean wordBreak(String s, List<String> w) {
        int dp[]= new int[s.length()];
        Arrays.fill(dp,-1);
        HashSet<String>st= new HashSet<>();
        for(int i=0;i<w.size();i++){
            st.add(w.get(i));
        }
        return func(s,st,0,dp);
    }
}