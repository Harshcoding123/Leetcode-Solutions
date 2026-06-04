class Solution {
    public boolean canMakeSquare(char[][] g) {
        int b=0;int w=0;
        if(g[0][0]=='B') b++;
        else w++;
        if(g[0][1]=='B') b++;
        else w++;
        if(g[1][0]=='B') b++;
        else w++;
        if(g[1][1]=='B') b++;
        else w++;
        if(b==3||b==4||w==3||w==4) return true;
        b=0;w=0;

          if(g[0][1]=='B') b++;
        else w++;
        if(g[0][2]=='B') b++;
        else w++;
        if(g[1][1]=='B') b++;
        else w++;
        if(g[1][2]=='B') b++;
        else w++;
        if(b==3||b==4||w==3||w==4) return true;
        b=0;w=0;

          if(g[1][0]=='B') b++;
        else w++;
        if(g[1][1]=='B') b++;
        else w++;
        if(g[2][0]=='B') b++;
        else w++;
        if(g[2][1]=='B') b++;
        else w++;
        if(b==3||b==4||w==3||w==4) return true;
        b=0;w=0;

          if(g[1][1]=='B') b++;
        else w++;
        if(g[1][2]=='B') b++;
        else w++;
        if(g[2][1]=='B') b++;
        else w++;
        if(g[2][2]=='B') b++;
        else w++;
        if(b==3||b==4||w==3||w==4) return true;
        b=0;w=0;

        return false;
        
    }
}