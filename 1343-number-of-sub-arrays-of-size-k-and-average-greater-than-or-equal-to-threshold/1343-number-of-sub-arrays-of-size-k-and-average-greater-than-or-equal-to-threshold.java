class Solution {
    public int numOfSubarrays(int[] arr, int k, int th) {
        int sum=0;int ans=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(i==k-1) {
                int avg =sum/k;
                if(avg>=th) ans++;
            }
            if(i>=k){
                sum-=arr[i-k];
                int avg =sum/k;
                if(avg>=th) ans++;
            }
        }
        return ans;
    }
}