class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer>p1 =new PriorityQueue<>((a,b)->Integer.compare(b,a));
        PriorityQueue<Integer>p2 =new PriorityQueue<>();
        for(int i=0;i<nums1.length;i++){
            if(p1.isEmpty()||nums1[i]<=p1.peek()) p1.add(nums1[i]);
            else p2.add(nums1[i]);

            if(p2.size()>=p1.size()+1) p1.add(p2.remove());
            else if(p1.size()>=p2.size()+2) p2.add(p1.remove());
        }
        for(int i=0;i<nums2.length;i++){
            if(p1.isEmpty()||nums2[i]<=p1.peek()) p1.add(nums2[i]);
            else p2.add(nums2[i]);
            if(p2.size()>=p1.size()+1) p1.add(p2.remove());
            else if(p1.size()>=p2.size()+2) p2.add(p1.remove());
        }
        int v =p1.size()+p2.size();
        if(v%2!=0) return (double)p1.peek();
        
            int v1 =p1.peek();
            int v2 =p2.peek();
            double t= ((v1+v2)/2.0);
            return t;
        
        
    }
}