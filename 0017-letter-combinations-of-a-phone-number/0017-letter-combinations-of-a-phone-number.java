class Solution {
    void func(String d,int idx,StringBuilder sb,ArrayList<String>a,HashMap<Integer,String>mp){
        if(idx>=d.length()){
            a.add(sb.toString());
            return;
        }
        int n = (int)d.charAt(idx)-'0';
        String s= mp.get(n);
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            func(d,idx+1,sb,a,mp);
            sb.deleteCharAt(sb.length()-1);
        }
        
    }
    public List<String> letterCombinations(String d) {
        HashMap<Integer,String>mp =new HashMap<>();
        mp.put(2,"abc");
        mp.put(3,"def");
        mp.put(4,"ghi");
        mp.put(5,"jkl");
        mp.put(6,"mno");
        mp.put(7,"pqrs");
        mp.put(8,"tuv");
        mp.put(9,"wxyz");
        StringBuilder sb= new StringBuilder();
        ArrayList<String>a= new ArrayList<>();
        func(d,0,sb,a,mp);
        return a;
    }
    
}