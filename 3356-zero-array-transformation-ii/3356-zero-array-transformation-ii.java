class Solution {
    boolean func(int nums[],int [][]q,int k){
        int f[]= new int[nums.length];
        for(int i=0;i<k;i++){
            int st= q[i][0];
            int end =q[i][1];
            int d= q[i][2];
            f[st]+=d;
            if(end+1<f.length) f[end+1]-=d;

        }
        int s=0;
        for(int i=0;i<f.length;i++){
            s+=f[i];
            if(s<nums[i]) return false;
        }
        return true;
    }
    public int minZeroArray(int[] nums, int[][] q) {
        int min= 1;
        int max =q.length;
        int ans =-1;
        while(min<=max){
            int k= (min+max)/2;
            boolean c= func(nums,q,k);
            if(c){
                ans= k;
                max =k-1;
            }else min= k+1;
            
        }
        if(ans==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0) return ans;
            }
            return 0;
        }
        return ans;
        
    }
}