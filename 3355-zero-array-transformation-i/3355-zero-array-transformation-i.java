class Solution {
    public boolean isZeroArray(int[] nums, int[][] q) {
        int f[]= new int[nums.length];
        for(int i=0;i<q.length;i++){
            int st= q[i][0];
            int end =q[i][1];
            f[st]+=1;
            if(end+1<f.length) f[end+1]-=1;

        }
        int s=0;
        for(int i=0;i<f.length;i++){
            s+=f[i];
            if(s<nums[i]) return false;
        }
        return true;
        
    }
}