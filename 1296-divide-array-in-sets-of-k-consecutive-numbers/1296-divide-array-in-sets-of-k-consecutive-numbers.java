class Solution {
    public boolean isPossibleDivide(int[] h, int k) {
        if(h.length%k!=0) return false;
        HashMap<Integer,Integer>mp =new HashMap<>();
        PriorityQueue<Integer>pq =new PriorityQueue<>();
       for(int i=0;i<h.length;i++){
            if(!mp.containsKey(h[i])){
             mp.put(h[i],1);
             pq.add(h[i]);
            }
            else mp.put(h[i],mp.get(h[i])+1);
        }
        while(mp.size()>0){
            int p=-1;
            for(int i=1;i<=k;i++){
                if(i==1){
                    p= pq.peek();
                    mp.put(p,mp.get(p)-1);
                    if(mp.get(p)==0){
                        mp.remove(p);
                        pq.remove();
                    }
                }else{
                    if(!mp.containsKey(p+1)) return false;
                    mp.put(p+1,mp.get(p+1)-1);
                     if(mp.get(p+1)==0){
                        if(p+1!=pq.peek()) return false;
                        mp.remove(p+1);
                        pq.remove();
                    }
                    p =p+1;
                }
            }
        }
        return true;
        
    }
}