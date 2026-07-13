class Solution {
    public int countDays(int d, int[][] m) {
        if(m.length==0) return d;
        int sum=0;
        Arrays.sort(m,(a,b)->Integer.compare(a[0],b[0]));
         int st =m[0][0];int end= m[0][1];
        for(int i=1;i<m.length;i++){
            if(end>=m[i][0]) end= Math.max(end,m[i][1]);
            else{
                sum+=((end-st)+1);
                st= m[i][0];
                end= m[i][1];
            }
        }
        sum+=((end-st)+1);
        return d-sum;
        
    }
}