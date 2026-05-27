class Solution {
    public int numberOfSpecialChars(String w) {
        HashMap<Character,Integer>mp1= new HashMap<>();
        HashMap<Character,Integer>mp2= new HashMap<>();
        for(int i=0;i<w.length();i++){
            char ch =w.charAt(i);
            int asci= (int)ch;
            if(asci>='a'&&asci<='z'){
                mp1.put(ch,i);
                
            }else{
                if(!mp2.containsKey(ch)) mp2.put(ch,i);
            }
        }int ans=0;
        for(var i:mp1.keySet()){
            int v1 =mp1.get(i);
            char ch = Character.toUpperCase(i);
            if(mp2.containsKey(ch)){
                int v2= mp2.get(ch);
                if(v1<v2) ans++;
            }
        }
        return ans;

    }
}