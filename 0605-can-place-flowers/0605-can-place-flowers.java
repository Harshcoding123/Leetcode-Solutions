class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        for(int i=0;i<f.length;i++){
            if(f[i]==1) i++;
            else {
                if(i+1==f.length) n--;
                if(i+1<f.length&&f[i+1]!=1) {
                    n--;
                    i++;
                }
            }

        }
        if(n>0) return false;
        return true;

        
    }
}