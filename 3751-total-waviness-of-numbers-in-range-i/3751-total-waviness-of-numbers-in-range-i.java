class Solution {
    public int totalWaviness(int n1, int n2) {
        int ans=0;
        for(int i=n1;i<=n2;i++){
            int v=i;
             ArrayList<Integer>a= new ArrayList<>();
            while(v>0){
                a.add(v%10);
                v/=10;
            }
            if(a.size()>2){
                for(int j=a.size()-2;j>0;j--){
                    if(a.get(j)>a.get(j-1)&&a.get(j)>a.get(j+1)) ans++;
                    else if(a.get(j)<a.get(j-1)&&a.get(j)<a.get(j+1)) ans++;
                }
            }



        }
        return ans;

        
    }
}