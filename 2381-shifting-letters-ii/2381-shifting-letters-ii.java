class Solution {
    public String shiftingLetters(String s, int[][] shift) {
        int f[] =new int[s.length()];
        for(int i=0;i<shift.length;i++){
            int st =shift[i][0];
            int end= shift[i][1];
            int d= shift[i][2];
            int v =0;
            if(d==1) v =1;
            else v =-1;
            f[st]+=v;
            if(end+1<f.length) f[end+1]-=v;

        }
        for(int i=1;i<f.length;i++){
            f[i]= f[i]+f[i-1];
        }
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<s.length();i++){
            f[i]=f[i]%26;
            int sf = ((f[i] % 26) + 26) % 26;
            sb.append((char)((s.charAt(i) - 'a' + sf) % 26 + 'a'));
        }

        
        return sb.toString();
        
    }
}