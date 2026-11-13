class MyStack {
    Queue<Integer>q;
    int size;

    public MyStack() {
        q= new LinkedList<>();
        size=0;
    }
    
    public void push(int x) {
        q.add(x);
        size++;
    }
    
    public int pop() {
        for(int i=1;i<size;i++){
            q.add(q.remove());
        }
        size--;
        return q.remove();

    }
    
    public int top() {
        for(int i=1;i<size;i++){
            q.add(q.remove());
        }
        int v =q.peek();
        q.add(q.remove());
        return v;
    }
    
    public boolean empty() {
        if(size>0) return false;
        return true;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */