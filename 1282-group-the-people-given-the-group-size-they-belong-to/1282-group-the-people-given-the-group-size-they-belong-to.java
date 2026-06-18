class Solution {
    public List<List<Integer>> groupThePeople(int[] gs) {
        List<List<Integer>>ans =new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>>mp= new HashMap<>();
        for(int i=0;i<gs.length;i++){
            if(!mp.containsKey(gs[i])){
                ArrayList<Integer>a =new ArrayList<>();
                mp.put(gs[i],a);
                a.add(i);
            }else{
                ArrayList<Integer>a =mp.get(gs[i]);
                a.add(i);
            
            }
        }
        for(var i:mp.keySet()){
            ArrayList<Integer>as =mp.get(i);
            int n =as.size();
              n= n/i;
              int idx=0;
            while(n>0){
                ArrayList<Integer>a =new ArrayList<>();
                for(int k=1;k<=i;k++){
                    a.add(as.get(idx++));
                }
                n--;
                ans.add(a);
            }
            
        }
        return ans;
    }
}