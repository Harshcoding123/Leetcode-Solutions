class Solution {
    public int partitionString(String s) {
        int ans=0;
        HashSet<Character>st= new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(!st.contains(ch)) st.add(ch);
            else {
                ans++;
                st= new HashSet<>();
                st.add(ch);
            }
        }
        return ans+1;
        
    }
}