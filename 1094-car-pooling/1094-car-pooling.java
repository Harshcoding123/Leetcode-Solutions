class Solution {
    public boolean carPooling(int[][] t, int cap) {
        int a[] =new int[1001];
        
        for(int i=0;i<t.length;i++){
            a[t[i][1]]+= t[i][0];
            a[t[i][2]]-= t[i][0];
          
        }
        int s=0;
        for(int i=0;i<1001;i++){
            s+=a[i];
            if(s>cap) return false;
        }
        return true;

        
    }
}