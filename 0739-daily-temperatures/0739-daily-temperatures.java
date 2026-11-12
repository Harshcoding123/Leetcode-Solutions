class Solution {
    public int[] dailyTemperatures(int[] t) {
        int a[]= new int[t.length];
        Stack<Integer>st= new Stack<>();
        for(int i=t.length-1;i>=0;i--){
            while(st.size()>0&&t[i]>=t[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()) {
                a[i]= 0;
            }else{
                a[i]=st.peek()-i;
            }
            st.add(i);
            

        }
        return a;
        
    }
}