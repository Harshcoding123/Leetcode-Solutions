class Solution {
    public int minimumRecolors(String b, int k) {
        int ans=0;int ar=Integer.MAX_VALUE;
        for(int i=0;i<b.length();i++){
            
            char ch =b.charAt(i);
            if(ch=='W') ans++;
            if(i==k-1) ar=Math.min(ar,ans);
            if(i>=k){
                
                if(b.charAt(i-k)=='W') ans--;
                 ar=Math.min(ar,ans);
            }

        }
        return ar;
    }
}