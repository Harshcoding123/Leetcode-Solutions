class Solution {
    public int[] diStringMatch(String s) {
        
        int n= s.length();
        int ans[] =new int[n+1];
        int d=n;int i=0;
        for(int k=0;k<s.length();k++){
            char ch =s.charAt(k);
            if(ch=='D') ans[k]= d--;
            else ans[k]= i++;

        }
        ans[n] =d;
        return ans;
        
        
    }
}