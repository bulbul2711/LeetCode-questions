class ListNode{
    int key,value;
    ListNode prev,next;
    ListNode(int _key,int _value){
        key=_key;
        value=_value;
    }
}
class LRUCache {
    HashMap<Integer,ListNode> map=new HashMap<>();
    ListNode head=new ListNode(0,0);
    ListNode tail=new ListNode(0,0);
    int cap=0;
    
    public LRUCache(int capacity) {
        head.next=tail;
        tail.prev=head;
        cap=capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            ListNode node=map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            ListNode node=map.get(key);
            remove(node);
        }
        else if(map.size()==cap){
            remove(tail.prev);
        }
         insert(new ListNode(key,value));
    }
    public void insert(ListNode Node){
        map.put(Node.key,Node);
        ListNode nxt=head.next;
        head.next=Node;
        Node.prev=head;
        Node.next=nxt;
        nxt.prev=Node;
    }
    public void remove(ListNode Node){
        map.remove(Node.key);
        Node.prev.next=Node.next;
        Node.next.prev=Node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */