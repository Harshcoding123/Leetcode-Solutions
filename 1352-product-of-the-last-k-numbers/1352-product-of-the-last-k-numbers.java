class ProductOfNumbers {
    ArrayList<Integer> a;
    public ProductOfNumbers() {
        a= new ArrayList<>();
        a.add(1);
        
    }
    
    public void add(int num) {
        if(num>0) a.add(a.get(a.size()-1)*num);
        else {
            a= new ArrayList<>();
            a.add(1);
        }
    }
    
    public int getProduct(int k) {
        int n= a.size();
        if(n<=k) return 0;
        else return a.get(n-1)/a.get(n-1-k);
    
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */