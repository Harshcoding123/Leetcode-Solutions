class Solution {
    int[] countSort(int arr[]){
        int max= arr[0];
        for(int i=0;i<arr.length;i++){
            max= Math.max(max,arr[i]);
        }
        int freq[]= new int[max+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=1;i<freq.length;i++){
            freq[i]= freq[i]+freq[i-1];
        }
        int ans[]= new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int v= freq[arr[i]];
            ans[v-1]= arr[i];
            freq[arr[i]]--;
        }
        return ans;

    }
    public int maxIceCream(int[] c, int coin) {
        // Arrays.sort(cost);
        int cost[]= new int[c.length];
        cost =countSort(c);
        int ans=0;
        for(int i=0;i<cost.length;i++){
            if(cost[i]<=coin){
                coin-=cost[i];
                ans++;
            }else break;
        }
        return ans;
        
    }
}