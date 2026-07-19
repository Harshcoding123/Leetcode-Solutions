class Solution {
    void func(int n,int k,int idx,ArrayList<Integer>a,List<List<Integer>>ans){
        
        a.add(idx);
        if(a.size()==k){
        
            ans.add(new ArrayList(a));
            a.remove(a.size()-1);
            return;
        }
        for(int i=idx+1;i<=n;i++){
            func(n,k,i,a,ans);
            
        }
        a.remove(a.size()-1);

    }
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer>a =new ArrayList<>();
        List<List<Integer>>ans= new ArrayList<>();
        for(int i=1;i<=n;i++){
        func(n,k,i,a,ans);
        }
        return ans;
        
    }
}