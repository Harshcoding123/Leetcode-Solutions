class Solution {
    public int maxIceCream(int[] cost, int coin) {
        Arrays.sort(cost);
        int ans=0;
        for(int i=0;i<cost.length;i++){
            if(cost[i]<=coin){
                coin-=cost[i];
                ans++;
            }else break;
        }
        return ans;
        
    }
}