class Solution {
    void func(int n,int k,int idx,ArrayList<Integer>a,List<List<Integer>>ans){
        
       
        if(a.size()==k){
        
            ans.add(new ArrayList<>(a));
            
            return;
        }
        for(int i=idx;i<=n;i++){
            a.add(i);
            func(n,k,i+1,a,ans);
            a.remove(a.size()-1);
            
        }
        

    }
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer>a =new ArrayList<>();
        List<List<Integer>>ans= new ArrayList<>();
        
        func(n,k,1,a,ans);
        
        return ans;
        
    }
}