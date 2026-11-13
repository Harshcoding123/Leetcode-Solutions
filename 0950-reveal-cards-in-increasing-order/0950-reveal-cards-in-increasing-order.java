class Solution {
    public int[] deckRevealedIncreasing(int[] d) {
        Queue<Integer>q =new LinkedList<>();
        int n =d.length;
        for(int i=0;i<n;i++){
            q.add(i);
        }
        Arrays.sort(d);
        int idx= 0;
        int a[]= new int[d.length];
        while(q.size()>0){
            a[q.remove()]= d[idx++];
          if(q.size()>0)  q.add(q.remove());
        }
        return a;

    }
}