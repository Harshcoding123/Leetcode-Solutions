class Solution {
    public boolean carPooling(int[][] a, int cap) {
        Arrays.sort(a,(p,b)->Integer.compare(p[1],b[1]));
        PriorityQueue<int []>pq =new PriorityQueue<>((p,b)->(p[0]-b[0]));
        int c =a[0][0];
        int p= a[0][1];
        int d =a[0][2];
        if(c>cap) return false;
        pq.add(new int[]{d,c});
        for(int i=1;i<a.length;i++){
            while(pq.size()>0&&a[i][1]>=pq.peek()[0]){
                c-=pq.remove()[1];
            }
            if(c+a[i][0]>cap) return false;
            c+=a[i][0];
            pq.add(new int[]{a[i][2],a[i][0]});
        }
        return true;
        
    }
}