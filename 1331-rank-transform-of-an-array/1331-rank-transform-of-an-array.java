class Solution {
    public int[] arrayRankTransform(int[] arr) {
        PriorityQueue<Integer>pq= new PriorityQueue<>();
        HashMap<Integer,Integer>mp =new HashMap<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int idx=1;
        while(pq.size()>0){
            int v= pq.remove();
            if(!mp.containsKey(v)){
                 mp.put(v,idx);
                 idx++;
            }
            
        }
        
        int ans[]= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]= mp.get(arr[i]);
        }
        return ans;
        
    }
}