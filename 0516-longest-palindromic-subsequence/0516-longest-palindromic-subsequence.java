class Solution {
    boolean palindrome(String s){
        int i=0;int j= s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;j--;
        }
        return true;

    }
    int func(String s,int idx,StringBuilder sb){
        if(idx>=s.length()){
            if(palindrome(sb.toString())) return sb.length();
            return 0;
        }
        sb.append(s.charAt(idx));
       int v1= func(s,idx+1,sb);
        sb.deleteCharAt(sb.length()-1);
        int v2=func(s,idx+1,sb);
        return Math.max(v1,v2);
    }
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb= new StringBuilder();
        return func(s,0,sb);
        
    }
}