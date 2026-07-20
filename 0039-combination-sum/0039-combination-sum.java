class Solution {
    void func(int c[],int t,int s,int idx,ArrayList<Integer>a,List<List<Integer>>ans){
        if(s>t||idx>=c.length) return;
        if(s==t){
            ans.add(new ArrayList<>(a));
            return;
        }
        a.add(c[idx]);
        func(c,t,s+c[idx],idx,a,ans);
        a.remove(a.size()-1);
        func(c,t,s,idx+1,a,ans);
    }
    public List<List<Integer>> combinationSum(int[] c, int t) {
        List<List<Integer>>ans= new ArrayList<>();
        ArrayList<Integer>a= new ArrayList<>();
        func(c,t,0,0,a,ans);
        return ans;
        


    }
}