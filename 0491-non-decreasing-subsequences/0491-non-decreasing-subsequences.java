class Solution {
    void func(int nums[],int p,int idx,ArrayList<Integer>a,List<List<Integer>>ans,HashSet<ArrayList<Integer>>st){
        if(idx>=nums.length){
            return;
        }
        if(p!=-1&&nums[p]>nums[idx]){
            func(nums,p,idx+1,a,ans,st);
        }else{
            a.add(nums[idx]);
           if(a.size()>1){
            ArrayList<Integer>arr =new ArrayList<>(a);
            // arr =a;
            if(!st.contains(arr)) ans.add(arr);
            st.add(arr);
             
           }
            func(nums,idx,idx+1,a,ans,st);
            a.remove(a.size()-1);
            func(nums,p,idx+1,a,ans,st);
        }
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        ArrayList<Integer>a= new ArrayList<>();
        List<List<Integer>>ans =new ArrayList<>();
        HashSet<ArrayList<Integer>>st= new HashSet<>();
        func(nums,-1,0,a,ans,st);
        return ans;

    }
}