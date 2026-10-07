class Solution {
    public int singleNonDuplicate(int[] a) {
     int i=1;int j=a.length-2;
     if(a.length==1) return a[0];
     if(a[0]!=a[1]) return a[0];
     if(a[a.length-1]!=a[a.length-2]) return a[a.length-1];
     while(i<=j){
        int mid =(i+j)/2;
       if(a[mid]!=a[mid+1]&&a[mid]!=a[mid-1]) return a[mid];
       if(a[mid]==a[mid+1]){
        if(mid%2!=0) j= mid-1;
        else i= mid+1;
       }else{
        if(mid%2==0) j= mid-1;
        else i= mid+1;

       }
       
     }   
     return -1;
    }
}