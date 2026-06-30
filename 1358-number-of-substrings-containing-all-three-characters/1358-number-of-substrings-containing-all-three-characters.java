class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer>mp =new HashMap<>();
        int l=0;int ans=0;int n =s.length();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(!mp.containsKey(ch)) mp.put(ch,1);
            else mp.put(ch,mp.get(ch)+1);
            while(mp.size()==3){
                ans+=(n-i);
                char ch2= s.charAt(l);
                mp.put(ch2,mp.get(ch2)-1);
                if(mp.get(ch2)==0) mp.remove(ch2);
                l++;
            }
        }
        return ans;
        
    }
}