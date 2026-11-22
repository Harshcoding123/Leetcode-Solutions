class Solution {
    public void func(int nums[],List<List<Integer>>ans,ArrayList<Integer>a,boolean vis[]){
        boolean check= false;
        for(int i=0;i<nums.length;i++){
            
            if(!vis[i]){
                check= true;
                a.add(nums[i]);
                vis[i] =true;
                func(nums,ans,a,vis);
                a.remove(a.size()-1);
                vis[i]= false;
            }

        }
        if(!check){
            ans.add(new ArrayList<>(a));
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans =new ArrayList<>();
        ArrayList<Integer>a =new ArrayList<>();
        boolean vis[] =new boolean[nums.length];
        func(nums,ans,a,vis);
        return ans;
    }
}