class Solution {
    public int minDeletions(String s) {
        char []a =s.toCharArray();
        Arrays.sort(a);
        char p= a[0];
        int f=0;
        int op=0;
        HashSet<Integer>st =new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(p==a[i]) f++;
            else{
                while(st.size()>0&&st.contains(f)){
                    f--;
                    op++;
                }
                if(f>0) st.add(f);
                p= a[i];
                f=1;

            }

        }
         while(st.size()>0&&st.contains(f)){
                    f--;
                    op++;
                }
                return op;

        
    }
}