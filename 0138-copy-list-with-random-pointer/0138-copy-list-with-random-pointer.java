/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node>mp =new HashMap<>();
        Node h= head;
        while(h!=null){
            if(!mp.containsKey(h)){
                Node t= new Node(h.val);
                mp.put(h,t);
            }
            if(h.next==null) mp.get(h).next= null;
            else{
                if(!mp.containsKey(h.next)){
                     Node t= new Node(h.next.val);
                    mp.put(h.next,t);
                }
                mp.get(h).next =mp.get(h.next);
            }
            if(h.random==null) mp.get(h).random =null;
            else{
                 if(!mp.containsKey(h.random)){
                     Node t= new Node(h.random.val);
                    mp.put(h.random,t);
                }
                mp.get(h).random =mp.get(h.random);
            }

            h= h.next;




        }
        return mp.get(head);
        
    }
}