class Solution {
    public int[] nextGreaterElement(int[] n1, int[] n2) {
        HashMap<Integer,Integer>mp= new HashMap<>();
        Stack<Integer>st =new Stack<>();
        for(int i=n2.length-1;i>=0;i--){
            while(st.size()>0&&st.peek()<n2[i]){
                st.pop();
            }
            if(st.size()==0) mp.put(n2[i],-1);
            else mp.put(n2[i],st.peek());
            st.add(n2[i]);
        }

        for(int i=0;i<n1.length;i++){
            n1[i] =mp.get(n1[i]);
        }
        return n1;
    }
}