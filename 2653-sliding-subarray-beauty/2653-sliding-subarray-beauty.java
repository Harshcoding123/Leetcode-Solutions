class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n =nums.length;
        int ans[]= new int[n-k+1];
       
        ArrayList<Integer>a =new ArrayList<>();
        int idx=0;
        for(int i=0;i<n;i++){
            a.add(nums[i]);
            if(i>=k){
                a.remove(0);
            }
            if(a.size()==k){
                PriorityQueue<Integer>pq= new PriorityQueue<>((p,b)->Integer.compare(b,p));
                for(int j=0;j<a.size();j++){
                    pq.add(a.get(j));
                    if(pq.size()>x) pq.remove();
                }
                int v= pq.remove();
                if(v<0) ans[idx++]= v;
                else ans[idx++]= 0;
            }
        }
        return ans;
        
    }
}