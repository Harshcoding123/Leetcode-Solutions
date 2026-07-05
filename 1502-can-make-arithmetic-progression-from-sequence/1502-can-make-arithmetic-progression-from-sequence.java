class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d=0;
        for(int i=1;i<arr.length;i++){
            if(i==1) d= arr[i]-arr[i-1];
            else{
                if((arr[i]-arr[i-1])!=d) return false;
            }
        }
        return true;
        
    }
}