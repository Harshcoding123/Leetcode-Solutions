class Solution {
    public String mapWordWeights(String[] w, int[] wt) {
        String ans="";
        for(int i=0;i<w.length;i++){
            String s =w[i];int sum=0;
            for(int j=0;j<s.length();j++){
                char ch =s.charAt(j);
                int asci =(int)ch-'a';
                sum+=wt[asci];
            }
            sum= sum%26;
            sum =25-sum;
            int asci2='a'+sum;
            char ch2 =(char)asci2;
            ans+=ch2;

        }
        return ans;
        
    }
}