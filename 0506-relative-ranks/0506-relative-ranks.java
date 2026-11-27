class Solution {
    public String[] findRelativeRanks(int[] s) {
        PriorityQueue<int []>pq= new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<s.length;i++){
            pq.add(new int[]{s[i],i});
        }
        String a[]= new String[s.length];
        int c=1;
        while(pq.size()>0){
            if(c==1){
                a[pq.remove()[1]]= "Gold Medal";
                c++;
            }else if(c==2){
                 a[pq.remove()[1]]= "Silver Medal";
                c++;
            }else if(c==3){
                 a[pq.remove()[1]]= "Bronze Medal";
                c++;
            }else{
                a[pq.remove()[1]]=""+c;
                c++;
            }
        }
        return a;

    }
}