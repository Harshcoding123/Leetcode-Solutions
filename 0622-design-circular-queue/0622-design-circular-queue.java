class MyCircularQueue {
    int a[];
    int s;
    int r;
    int f;
    public MyCircularQueue(int k) {
     a= new int[k];  
     s=0;
     f =-1; r =-1; 
    }
    
    public boolean enQueue(int value) {
        if(r==-1){
            r++;f=0;
            a[r] =value;
            return true;
        }
         if(r+1==f) return false;
        else if(r==a.length-1){
            if(f==0) return false;
            r=0;
            a[r]= value;
            return true;
        }
        r++;
        a[r]= value;
        return true;

    }
    
    public boolean deQueue() {
        if(f==-1) return false;
        if(r==f) {
            f =-1;r= -1;
            return true;
        }
        if(f==a.length-1){
            f=0;
            return true;
        }
        f++;
        return true;

        
        
    }
    
    public int Front() {
        if(f==-1) return -1;
        return a[f];
    }
    
    public int Rear() {
        if(r==-1) return -1;
        return a[r];
    }
    
    public boolean isEmpty() {
        if(f==-1) return true;
        return false;
    }
    
    public boolean isFull() {
        if(r+1==f) return true;
        if(r==a.length-1&&f==0) return true; 
        return false;  
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */