class Solution {
    public int minimumDeletions(int[] nums) {
        int min=0;int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[min]>nums[i]) min= i;
            if(nums[max]<nums[i]) max= i;
        }
        int n= nums.length;
        int l1= min+1;
        int l2 =max+1;
        int r1= n-min;
        int r2= n-max;
        char ch1 ='.';
        char ch2= '.';
        int v=0;
        if(l1<r1) ch1= 'l';
        else ch1='r';
        if(l2<r2) ch2='x';
        else ch2='y';
        if(ch1=='l'&&ch2=='x') v= Math.max(l1,l2);
        else if(ch1=='r'&&ch2=='y') v= Math.max(r1,r2);
        else if(ch1=='l'&&ch2=='y') v= l1+r2;
        else if(ch1=='r'&&ch2=='x') v= r1+l2;
        if(Math.max(l1 ,l2)<v) v= Math.max(l1,l2);
        if(Math.max(r1,r2)<v) v= Math.max(r1,r2);
        return v;
        
    }
}