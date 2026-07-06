class Solution {
    public String originalDigits(String s) {
        int freq[]= new int[10];
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='z') freq[0]++;
            if(ch=='w') freq[2]++;
            if(ch=='x') freq[6]++;
            if(ch=='u') freq[4]++;
            if(ch=='g') freq[8]++;

            if(ch=='o') freq[1]++;
            if(ch=='h') freq[3]++;
            if(ch=='s') freq[7]++;
            if(ch=='f') freq[5]++;
            if(ch=='i') freq[9]++;
        }
        freq[3]= freq[3]-freq[8];
        freq[1] =freq[1]-freq[0]-freq[2]-freq[4];
        freq[5] =freq[5]-freq[4];
        freq[7]= freq[7]-freq[6];
        freq[9]= freq[9]-freq[8]-freq[6]-freq[5];
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<=9;i++){
            while(freq[i]>0){
                sb.append(i);
                freq[i]--;
            }
        }
        return sb.toString();
    }
}