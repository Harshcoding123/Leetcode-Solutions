class Solution {
    public int removeDuplicates(int[] a) {
        int i=0;int j= i+1;int ans=1;
        while(j<a.length){
            if(a[i]!=a[j]){
                ans++;
                int temp= a[i+1];
                a[i+1] =a[j];
                a[j]= temp;
                i++;j++;
            }else{
                j++;
            }
        }
        return ans;
    }
}