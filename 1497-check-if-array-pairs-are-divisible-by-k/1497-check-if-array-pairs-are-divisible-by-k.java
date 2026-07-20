class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer>mp= new HashMap<>();
        int c=0;
        for(int i=0;i<arr.length;i++){
            int r= ((arr[i]%k)+k)%k;  //deals with neg val (take any ex) 
            int v= k-r;
            if(r==0){
                v=0;
            }
            if(mp.containsKey(v)){
                c++;
                if(mp.get(v)==1) mp.remove(v);
                else mp.put((v),mp.get(v)-1);
            }else{
                if(!mp.containsKey(r)) mp.put(r,1);
            else mp.put(r,mp.get(r)+1);
            }
            
        }
        if(c==(arr.length/2)) return true;
        return false;
    }
}