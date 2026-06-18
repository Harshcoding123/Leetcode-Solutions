class Solution {
    public int numRabbits(int[] a) {
        HashMap<Integer,Integer>mp =new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(!mp.containsKey(a[i])) mp.put(a[i],1);
            else mp.put(a[i],mp.get(a[i])+1);
        }
        int ans=0;
        for(var i:mp.keySet()){
            int f= mp.get(i);
            int n =i+1;
            int v1= f/n;
            int v2 =f%n;
            ans+=(n*v1);
            if(v2!=0){
                ans+=n;
            }
            
        }
        return ans;
        
    }
}