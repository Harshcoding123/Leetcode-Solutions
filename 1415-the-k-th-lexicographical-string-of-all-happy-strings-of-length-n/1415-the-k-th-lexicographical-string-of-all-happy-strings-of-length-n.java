class Solution {
    void func(int n,int k,StringBuilder sb,String s[],int c[]){
        if(s[0].length()>0) return;
        if(sb.length()==n){
            c[0]+=1;
            if(k==c[0]){
                s[0]= sb.toString();
                
            }
            
            return;
        }
        
        if(sb.length()==0||sb.charAt(sb.length()-1)!='a'){
            sb.append('a');
            func(n,k,sb,s,c);
            sb.deleteCharAt(sb.length()-1);
        }
         
        if(sb.length()==0||sb.charAt(sb.length()-1)!='b'){
            sb.append('b');
            func(n,k,sb,s,c);
            sb.deleteCharAt(sb.length()-1);
        }
         
        if(sb.length()==0||sb.charAt(sb.length()-1)!='c'){
            sb.append('c');
            func(n,k,sb,s,c);
            sb.deleteCharAt(sb.length()-1);
        }

    }
    public String getHappyString(int n, int k) {
        String s[] =new String[1];
        s[0]="";
        int c[]= new int[1];
        StringBuilder sb= new StringBuilder();
        func(n,k,sb,s,c);
        return s[0];
        
    }
}