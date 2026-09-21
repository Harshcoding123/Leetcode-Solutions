class Solution {
     boolean func(int a[],int idx,int c,HashMap<Integer,Integer>mp,int dp[][]){
            if(idx==a.length-1) return true;
            if(dp[idx][c]!=-1){
                if(dp[idx][c]==0) return false;
                else return true;
            }
            int j1 =c-1;
            int j2 =c;
            int j3 =c+1;
            

            if(j1>0&&mp.containsKey(a[idx]+j1)){
                
                boolean v= func(a,mp.get(a[idx]+j1),j1,mp,dp);
                
                if(v){
                    dp[idx][c]= 1;
                     return true;
                }

            }
            if(j2>0&&mp.containsKey(a[idx]+j2)){
                
                boolean v= func(a,mp.get(a[idx]+j2),j2,mp,dp);
                 if(v){
                    dp[idx][c]= 1;
                     return true;
                }

            }
            if(j3>0&&mp.containsKey(a[idx]+j3)){
                
                boolean v= func(a,mp.get(a[idx]+j3),j3,mp,dp);
                 if(v){
                    dp[idx][c]= 1;
                     return true;
                }

            }
             dp[idx][c]= 0;
             return false;
        }
    public boolean canCross(int[] a) {
       if(a.length==0||a.length==1) return true;
        HashMap<Integer,Integer>mp =new HashMap<>();

        for(int i=0;i<a.length;i++){
            if(!mp.containsKey(a[i]))  mp.put(a[i],i);
        }
        int dp[] []=new int [a.length][a.length];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return func(a,0,0,mp,dp);
    }
}