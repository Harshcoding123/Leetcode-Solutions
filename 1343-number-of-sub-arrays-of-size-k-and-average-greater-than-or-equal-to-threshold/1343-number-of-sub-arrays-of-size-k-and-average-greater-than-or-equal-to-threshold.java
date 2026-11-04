class Solution {
    public int numOfSubarrays(int[] arr, int k, int th) {
        int p=0;
        int l=0;int ans=0;
        for(int i=0;i<arr.length;i++){
            p+=arr[i];
            
            if(i>=k){
                p-=arr[l];
                l++;
            }
            if(i>=k-1){
                int avg= p/(i-l+1);
                if(avg>=th) ans++;
            }
            
        }
        return ans;
        
    }
}