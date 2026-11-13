class MyQueue {
    Stack<Integer>s1;
    Stack<Integer>s2;
    int s;
    
    public MyQueue() {
        s1=new Stack<>();
        s2= new Stack<>();
        s=0;
    }
    
    public void push(int x) {
        s1.push(x);
        s++;
    }
    
    public int pop() {
        for(int i=1;i<s;i++){
            s2.add(s1.pop());
        }
        s--;
        int v= s1.pop();
        while(s2.size()>0) s1.add(s2.pop());
        return v;
    }
    
    public int peek() {
         for(int i=1;i<s;i++){
            s2.add(s1.pop());
        }
       
        int v= s1.peek();
        while(s2.size()>0) s1.add(s2.pop());
        return v;
    }
    
    public boolean empty() {
        if(s>0) return false;
        return true;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */