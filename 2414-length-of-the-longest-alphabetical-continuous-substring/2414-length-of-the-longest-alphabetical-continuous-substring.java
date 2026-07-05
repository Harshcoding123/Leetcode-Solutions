class Solution {
    public int longestContinuousSubstring(String s) {
        int l=0;int ans=0;
        char p =s.charAt(0);
        for(int i=1;i<s.length();i++){
            char ch =s.charAt(i);
            if((int) ch != (int)p + 1) l=i;
            p= ch;
            ans= Math.max(ans,(i-l+1));
        }
        if(ans==0) return 1;
        return ans;
        
    }
}