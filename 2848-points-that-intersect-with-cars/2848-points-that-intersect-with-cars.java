class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Collections.sort(nums,(a,b)->Integer.compare(a.get(0),b.get(0)));
        int min= nums.get(0).get(0);
        int max =nums.get(0).get(1);
        int ans=0;
        for(int i=1;i<nums.size();i++){
            if(max>=nums.get(i).get(0)) max =Math.max(max,nums.get(i).get(1));
            else{
                 ans+=(max-min+1);
                 min= nums.get(i).get(0);
                 max =nums.get(i).get(1);
            }
        }
        ans+=(max-min+1);
        return ans;
    }
}