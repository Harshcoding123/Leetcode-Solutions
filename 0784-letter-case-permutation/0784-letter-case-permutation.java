class Solution {
    void func(String s,int idx,List<String>a,StringBuilder sb){
        if(sb.length()==s.length()){
            String s1 =sb.toString();
            a.add(s1);
            return;
        }
        char ch= s.charAt(idx);
        if(ch>='0'&&ch<='9'){
            sb.append(ch);
            func(s,idx+1,a,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        else if(ch>='a'&&ch<='z'){
            sb.append(ch);
            func(s,idx+1,a,sb);
            sb.deleteCharAt(sb.length()-1);
            sb.append((char)(ch-32));
            func(s,idx+1,a,sb);
             sb.deleteCharAt(sb.length()-1);

        }else{
            sb.append(ch);
            func(s,idx+1,a,sb);
            sb.deleteCharAt(sb.length()-1);
            sb.append((char)(ch+32));
            func(s,idx+1,a,sb);
             sb.deleteCharAt(sb.length()-1);

        }

    }
    public List<String> letterCasePermutation(String s) {
        ArrayList<String>a =new ArrayList<>();
        StringBuilder sb =new StringBuilder();
        func(s,0,a,sb);
        return a;
        
    }
}