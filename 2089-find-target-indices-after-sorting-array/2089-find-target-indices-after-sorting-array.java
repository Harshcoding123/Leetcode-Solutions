class Solution {
    public List<Integer> targetIndices(int[] nums, int t) {
        Arrays.sort(nums);
        int c=0;int f=0;ArrayList<Integer>a =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<t) c++;
            if(nums[i]==t) f++;

        }

        for(int i=1;i<=f;i++){
            a.add(c++);
        }
        return a;

        
        
    }
}