class Solution {
    public int countGoodSubstrings(String s) {
        int k =3;
        int ans=0;
        HashMap<Character,Integer>mp= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(!mp.containsKey(ch)) mp.put(ch,1);
                else mp.put(ch,mp.get(ch)+1);
            if(i>=k){
                char ch2 =s.charAt(i-k);
                mp.put(ch2,mp.get(ch2)-1);
                if(mp.get(ch2)==0) mp.remove(ch2);
            }
            if(mp.size()==k) ans++;
        }
        return ans;
    }
}