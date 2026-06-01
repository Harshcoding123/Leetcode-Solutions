class Solution {
    public boolean asteroidsDestroyed(int m, int[] a) {
     PriorityQueue<Integer>pq =new PriorityQueue<>();
     for(int i=0;i<a.length;i++){
        pq.add(a[i]);
     }
     long s= m;
     while(pq.size()>0){
        if(s<pq.peek()) return false;
        s+=pq.remove();
     }
     return true;

    }
}