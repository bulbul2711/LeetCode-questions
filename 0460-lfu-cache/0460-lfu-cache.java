class ListNode{
    int key,value;
    ListNode next,prev;
    int freq;
    ListNode(int _key,int _value){
        key=_key;
        value=_value;
        freq=1;
        next=null;
        prev=null;
    }
}
class DLL{
    ListNode head,tail;
    int listSize;
    DLL(){
        head=new ListNode(0,0);
        tail=new ListNode(0,0);
        head.next=tail;
        tail.prev=head;
        listSize=0;
    }
    public void removeNode(ListNode node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
        listSize--;
    }
    public void insertNode(ListNode node){
        ListNode nxt=head.next;
        head.next=node;
        node.next=nxt;
        nxt.prev=node;
        node.prev=head;
        listSize++;
    }
}
class LFUCache {
    HashMap<Integer,ListNode> cache;
    HashMap<Integer,DLL> freqmap;
    int cap;
    int cursize;
    int minfreq;
    public LFUCache(int capacity) {
        cap=capacity;
        cursize=0;
        minfreq=0;
        cache=new HashMap<>();
        freqmap=new HashMap<>();
    }
    
    public int get(int key) {
        ListNode node=cache.get(key);
        if(node==null)
            return -1;
        update(node);
        return node.value;
    }
    
    public void put(int key, int value) {
       if(cache.containsKey(key)){
           ListNode node=cache.get(key);
           node.value=value;
           update(node);
       }
        else{
            cursize++;
            if(cursize>cap){
                DLL list=freqmap.get(minfreq);
                cache.remove(list.tail.prev.key);
                list.removeNode(list.tail.prev);
                cursize--;
            }
            minfreq=1;
            ListNode newnode=new ListNode(key,value);
            DLL curlist=freqmap.getOrDefault(1,new DLL());
            curlist.insertNode(newnode);
            freqmap.put(1,curlist);
            cache.put(key,newnode);
        }
    }
    public void update(ListNode node){
        int curfreq=node.freq;
        DLL list=freqmap.get(curfreq);
        list.removeNode(node);
        
        if(curfreq==minfreq && list.listSize==0){
            minfreq++;
        }
        node.freq++;
        DLL newlist=freqmap.getOrDefault(node.freq,new DLL());
        newlist.insertNode(node);
        freqmap.put(node.freq,newlist);
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */