class Solution {
    public int findComplement(int num) {
        int n= num;
        int idx=0;
        while(n>0){
            int v= n&1;
            if(v==0){
                num= num|(1<<idx);

            }else{
                num= num&~(1<<idx);
            }
            idx++;
            n=n>>1;
        }
        return num;
        
    }
}