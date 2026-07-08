class Solution {
    public long interchangeableRectangles(int[][] r) {
        long ans= 0;
        HashMap<Double,Integer>mp =new HashMap<>();
        for(int i=0;i<r.length;i++){
            double v= (double)r[i][0]/r[i][1];
            if(!mp.containsKey(v)) mp.put(v,1);
            else{
                ans+=(mp.get(v));
                mp.put(v,mp.get(v)+1);
            }

        }
        return ans;
        
    }
}