class Solution {
    void func( ArrayList<Integer>a,ArrayList<Integer>ans,int arr[]){
        if(a.size()==0){
         
            int n =ans.size();
            int v1=ans.get(n-1);
            if((v1%n!=0)&&(n%v1!=0)) return;

            arr[0]+=1;
            return;
            
        }
        for(int i=0;i<a.size();i++){
            
            int n =ans.size();
            if(n!=0){
            int v1=ans.get(n-1);
            if((v1%n!=0)&&(n%v1!=0)) continue;
            }
            ans.add(a.get(i));
            int v= a.get(i);
            a.remove(i);
            func(a,ans,arr);
            a.add(i,v);
            ans.remove(ans.size()-1);
        }
    }
    public int countArrangement(int n) {
        ArrayList<Integer>a =new ArrayList<>();
         ArrayList<Integer>ans =new ArrayList<>();
         int arr[]= new int [1];
        for(int i=0;i<n;i++){
            a.add(i+1);
        }
        func(a,ans,arr);
        return arr[0];

        
    }
}