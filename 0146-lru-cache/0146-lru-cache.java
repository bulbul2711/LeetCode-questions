class ListNode{
    ListNode prev,next;
    int key,val;
    ListNode(int _key,int _val){
        key=_key;
        val=_val;
    }
}
class LRUCache {
    ListNode head=new ListNode(0,0);
    ListNode tail=new ListNode(0,0);
    HashMap<Integer,ListNode> map=new HashMap<>();
    int cap;
    public LRUCache(int capacity) {
        cap=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            ListNode node=map.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        else
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
    public void insert(ListNode node){
        ListNode nxt=head.next;
        head.next=node;
        node.prev=head;
        node.next=nxt;
        nxt.prev=node;
        map.put(node.key,node);
    }
    public void remove(ListNode node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
        map.remove(node.key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */