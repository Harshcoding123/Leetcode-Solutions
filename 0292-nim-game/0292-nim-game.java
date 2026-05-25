class Solution {
    public boolean canWinNim(int n) {
        int v= n%4;
        if(v==1||v==2||v==3) return true;
        return false;
    }
}