class Solution {
    void func(int nums[],int idx,ArrayList<Integer>a,List<List<Integer>>ans){
        if(idx>=nums.length){
            ans.add(new ArrayList<>(a));
            return;
        }
        a.add(nums[idx]);
        func(nums,idx+1,a,ans);
        a.remove(a.size()-1);
        func(nums,idx+1,a,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans =new ArrayList<>();
        ArrayList<Integer>a= new ArrayList<>();
        func(nums,0,a,ans);
        return ans;
    }
}