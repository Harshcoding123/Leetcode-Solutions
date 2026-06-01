class Solution {
    public int minimumCost(int[] c) {
        PriorityQueue<Integer>pq= new PriorityQueue<>((a,b)->Integer.compare(b,a));
        for(int i=0;i<c.length;i++){
            pq.add(c[i]);
        }

        int sum=0;
        while(pq.size()>0){
            if(pq.size()>0) sum+=pq.remove();
            if(pq.size()>0) sum+=pq.remove();
            if(pq.size()>0) pq.remove();

        }
        return sum;
        
    }
}