class Solution {
    public String greatestLetter(String w) {
         HashSet<Character>st= new HashSet<>();
        for(int i=0;i<w.length();i++){
            char ch= w.charAt(i);
            if(ch>='A'&&ch<='Z') st.add(ch);
        }
        
        char ans= ' ';
        for(int i=0;i<w.length();i++){
            char ch= w.charAt(i);
            if(ch>='a'&&ch<='z'){
                char ch2 =Character.toUpperCase(ch);
                if(st.contains(ch2)){
                   if(ans==' ') ans= ch2;
                   else{
                    if(ch2>ans) ans= ch2;
                   }
                    st.remove(ch2);
                }
            }
        }
        if(ans==' ') return "";
        return ""+ans;
        
    }
}