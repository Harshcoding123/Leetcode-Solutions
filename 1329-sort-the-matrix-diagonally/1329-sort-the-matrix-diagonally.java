class Solution {
    public int[][] diagonalSort(int[][] m) {
        HashMap<Integer,PriorityQueue<Integer>>mp= new HashMap<>();
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                int v= i-j;
                if(!mp.containsKey(v)){
                    PriorityQueue<Integer>pq =new PriorityQueue<>();
                    mp.put(v,pq);
                    pq.add(m[i][j]);
                   mp.put(v,pq);
                }
                else{
                    PriorityQueue<Integer>p =mp.get(v);
                     p.add(m[i][j]);
                     mp.put(v,p);
                }

            }
           
        }
         for(int i=0;i<m.length;i++){
                for(int j=0;j<m[0].length;j++){
                    int v= i-j;
                    
                      PriorityQueue<Integer>p= mp.get(v);
                      m[i][j] =p.remove();
                      mp.put(v,p);
                   
                }
            }
        return m;

        
    }
}