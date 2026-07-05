class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean>ans =new ArrayList<>();
        for(int i=0;i<l.length;i++){
            ArrayList<Integer>a =new ArrayList<>();
            for(int j=l[i];j<=r[i];j++){
                a.add(nums[j]);
            }
            Collections.sort(a);
            int d=0;boolean check=true;
            for(int k=1;k<a.size();k++){
                if(k==1) d =a.get(k)-a.get(k-1);
                else{
                    if((a.get(k)-a.get(k-1))!=d){
                        check= false;
                        break;
                    }
                }
            }
            ans.add(check);
        }
        return ans;


        
    }
}