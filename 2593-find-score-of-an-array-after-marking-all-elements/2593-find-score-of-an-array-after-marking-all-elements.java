class Solution {
    public long findScore(int[] nums) {
        PriorityQueue<int []>pq =new PriorityQueue<>((a,b)->{
            if(a[0]!=b[0]) return a[0]-b[0];
            else return a[1]-b[1];
        });
        boolean vis[] =new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            pq.add(new int[]{nums[i],i});
        }
        long ans=0;
        while(pq.size()>0){
            int a[] =pq.remove();
            int v =a[0];
            int idx =a[1];
            if(!vis[idx]) {
                ans+=v;
                vis[idx]= true;
                if(idx-1>=0) vis[idx-1]= true;
                if(idx+1<vis.length) vis[idx+1] =true;
            }
            
        }
        return ans;
        
    }
}