class Solution {
   
   
    public int getLucky(String s, int k) {
        StringBuilder st =new StringBuilder("");
       
        int n=0;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            int asci= ch-'a'+1;
            while(asci>0){
                n+=(asci%10);
                asci/=10;
            }

        }
        for(int i=1;i<k;i++){
            int s1=0;
            while(n>0){
                s1+=(n%10);
                n/=10;
            }
            n=s1;
        }
        return n;
        
    }
}