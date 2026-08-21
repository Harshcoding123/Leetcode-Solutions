class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int freq[] =new int [51];
        int n= nums.length;
        int ans[]= new int[n-k+1];
        int idx=0;int k1=0;
        for(int i=0;i<nums.length;i++){
            k1++;
            if(nums[i]<0) freq[nums[i]+50]++;
            int c=0;
            if(k1==k){
                 for(int j=0;j<freq.length;j++){
                    if(freq[j]>0) c+=freq[j];
                    if(c>=x){
                        ans[idx]= j-50;
                        break;
                    }
                }
                idx++;
            }
            if(k1>k){
              if(nums[i-k]<0)  freq[nums[(i-k)]+50]--;
                for(int j=0;j<freq.length;j++){
                    if(freq[j]>0) c+=freq[j];
                    if(c>=x){
                        ans[idx]= j-50;
                        break;
                    }
                    
                }
                idx++;
               
            }
        }
        return ans;
        
    }
}