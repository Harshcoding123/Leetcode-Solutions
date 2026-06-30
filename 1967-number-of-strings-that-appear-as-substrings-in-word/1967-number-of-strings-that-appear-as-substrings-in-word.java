class Solution {
    public int numOfStrings(String[] p, String w) {
        int ans=0;
        for(int i=0;i<p.length;i++){
            String s= p[i];
            if(w.contains(s)) ans++;
        }
        return ans;
    }
}