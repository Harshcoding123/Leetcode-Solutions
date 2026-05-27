class Solution {
    public int numberOfSpecialChars(String w) {
        HashSet<Character>st= new HashSet<>();
        for(int i=0;i<w.length();i++){
            char ch= w.charAt(i);
            if(ch>='A'&&ch<='Z') st.add(ch);
        }
        int ans=0;
        for(int i=0;i<w.length();i++){
            char ch= w.charAt(i);
            if(ch>='a'&&ch<='z'){
                char ch2 =Character.toUpperCase(ch);
                if(st.contains(ch2)){
                    ans++;
                    st.remove(ch2);
                }
            }
        }
        return ans;
    }
}