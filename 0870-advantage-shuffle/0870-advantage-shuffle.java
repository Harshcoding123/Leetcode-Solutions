class Solution {

    public int[] advantageCount(int[] nums1, int[] nums2) {
        PriorityQueue<int []>pq2= new PriorityQueue<>((a,b)->a[1]-b[1]);
        PriorityQueue<Integer>pq1= new PriorityQueue<>();
        ArrayList<Integer>a= new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            pq2.add(new int []{i,nums2[i]});
            pq1.add(nums1[i]);
        }
        int ans[] =new int[nums1.length];
        Arrays.fill(ans,-1);
        while(pq1.size()>0&&pq2.size()>0){
            int v2[]= pq2.remove();
            while(pq1.size()>0&&pq1.peek()<=v2[1]) a.add(pq1.remove());
            if(pq1.size()>0){
                int v1=pq1.remove();
                ans[v2[0]]= v1;
            }
            
        }
        int idx=0;
        for(int i=0;i<ans.length;i++){
            if(ans[i]==-1) ans[i]= a.get(idx++);
        }
        return ans;
    }
}