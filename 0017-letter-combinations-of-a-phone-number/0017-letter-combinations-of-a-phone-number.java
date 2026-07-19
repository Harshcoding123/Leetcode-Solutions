class Solution {
    void func(String d,StringBuilder sb,int idx,HashMap<Integer,ArrayList<Character>>mp, ArrayList<String>ans ){
        if(idx>=d.length()){
            ans.add(sb.toString());
            return;
        }

            int n= d.charAt(idx)-'0';
            ArrayList<Character>a= mp.get(n);
            for(int i=0;i<a.size();i++){
                char ch= a.get(i);
                sb.append(ch);
                func(d,sb,idx+1,mp,ans);
                sb.deleteCharAt(sb.length()-1);

            }

        
    }
    public List<String> letterCombinations(String d) {
        HashMap<Integer,ArrayList<Character>>mp =new HashMap<>();
        for(int i=2;i<=9;i++){
            ArrayList<Character>a =new ArrayList<>();
            mp.put(i,a);
        }
        ArrayList<String>ans =new ArrayList<>();
        ArrayList<Character>a= mp.get(2);
        a.add('a');a.add('b');a.add('c');

        a= mp.get(3);
        a.add('d');a.add('e');a.add('f');

        a= mp.get(4);
        a.add('g');a.add('h');a.add('i');

        a= mp.get(5);
        a.add('j');a.add('k');a.add('l');

       a= mp.get(6);
        a.add('m');a.add('n');a.add('o');

       a= mp.get(7);
        a.add('p');a.add('q');a.add('r');a.add('s');

        a= mp.get(8);
        a.add('t');a.add('u');a.add('v');

        a= mp.get(9);
        a.add('w');a.add('x');a.add('y');a.add('z');
        StringBuilder sb= new StringBuilder();
        
            func(d,sb,0,mp,ans);
        
        return ans;
    }
}