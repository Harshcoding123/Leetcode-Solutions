class Solution {
    public double angleClock(int h, int m) {
        double md =m*6;
        double hd= h*30;
        double ed= m*(0.5);
        double ahd =hd+ed;
        double ans =Math.abs(ahd-md);
        ans= Math.min(ans,(360-ans));
        return ans;
        
    }
}