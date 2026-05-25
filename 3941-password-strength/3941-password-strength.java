class Solution {
    public int passwordStrength(String p) {
        int sum=0;
        HashSet<Character>st = new HashSet<>();
        for(int i=0;i<p.length();i++){
            char ch= p.charAt(i);
            if(st.contains(ch)) continue;
            st.add(ch);
            int asci =(int)ch;
            if(asci>='a'&&asci<='z') sum+=1;
            else if(asci>='A'&&asci<='Z') sum+=2;
            else if(asci>='0'&&asci<='9') sum+=3;
            else if(ch=='!'||ch=='@'||ch=='#'||ch=='$') sum+=5;
        }
        return sum;
        
    }
}