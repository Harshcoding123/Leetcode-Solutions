class Solution {
    public String winningPlayer(int x, int y) {
        String s ="Alice";
        while(x>=1&&y>=4){
            x-=1;y-=4;
            if(s=="Alice") s= "Bob";
            else s="Alice";
        }
         if(s=="Alice") return "Bob";
            else return "Alice";

        
    }
}