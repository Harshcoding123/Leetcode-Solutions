class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>mp =new HashMap<>();
        HashSet<Character>st= new HashSet<>();
        int l=0;int ans=0;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
           while(st.contains(ch)) st.remove(s.charAt(l++));
           st.add(ch);
           ans =Math.max(ans,i-l+1);
        }
        return ans;
        
        
    }
}