class Solution {
    public String shiftingLetters(String s, int[] shift) {
        long f[] =new long[shift.length];
        int n =shift.length;
        f[n-1] =shift[n-1];
        for(int i=shift.length-2;i>=0;i--){
            f[i]= shift[i]+f[i+1];
        }
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            int asci =(int)ch;
            asci+=(f[i]%26);
            if(asci<='z')
            sb.append((char)asci);
            else{
                int t= asci-'z'-1;
                int asci2 ='a'+t;
                sb.append((char)asci2);


            }
        }
        return sb.toString();
  
    }
}