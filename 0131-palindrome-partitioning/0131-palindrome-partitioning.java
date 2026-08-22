class Solution {
    boolean p(StringBuilder sb){
        int i=0;int j= sb.length()-1;
        while(i<=j){
            if(sb.charAt(i)!=sb.charAt(j)) return false;
            i++;j--;
        }
        return true;

    }
    void func(String s,int idx,ArrayList<String>a,List<List<String>>ans){
        if(idx>=s.length()){
            ans.add(new ArrayList(a));
            return;
        }
        StringBuilder sb= new StringBuilder();
        for(int i=idx;i<s.length();i++){
            sb.append(s.charAt(i));
            if(!p(sb)) continue;
            a.add(sb.toString());
            func(s,i+1,a,ans);
            
            a.remove(a.size()-1);



        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>>ans =new ArrayList<>();
        ArrayList<String>a =new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        func(s,0,a,ans);
        return ans;

        
    }
}