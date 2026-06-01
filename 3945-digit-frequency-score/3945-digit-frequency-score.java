class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer>mp =new HashMap<>();
        while(n>0){
            int v =n%10;
            if(!mp.containsKey(v)) mp.put(v,1);
            else mp.put(v,mp.get(v)+1);
            n/=10;

        }
        int sum=0;
        for(var i:mp.keySet()){
            sum+=(i*mp.get(i));
        }
        return sum;
        
    }
}