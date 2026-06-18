class Solution {
    public String processStr(String s) {
        StringBuilder st =new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch!='#'&&ch!='%'&&ch!='*') st.append(ch);
            else if(ch=='#') st.append(st.toString());
            else if(ch=='%') {
                st.reverse();
            }
            else {
               if(st.length()>0) st.deleteCharAt(st.length()-1);
            }
        }
        return st.toString();
        
    }
}