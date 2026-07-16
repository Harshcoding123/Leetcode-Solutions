class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer>mp =new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(!mp.containsKey(ch)) mp.put(ch,1);
            else mp.put(ch,mp.get(ch)+1);
        }
        ArrayList<Integer>a =new ArrayList<>();
        HashSet<Character>st =new HashSet<>();
        int l=0;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(st.isEmpty()){
                st.add(ch);
            }else st.add(ch);

            if(mp.get(ch)==1){
                mp.remove(ch);
                st.remove(ch);
                if(st.size()==0){
                    a.add((i-l+1));
                    l= i+1;
                }
            }else mp.put(ch,mp.get(ch)-1);
            

        }
        return a;
    }
}