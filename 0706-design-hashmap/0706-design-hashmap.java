class ListNode{
    int pair[];
    ListNode next;
    ListNode(int key,int val){
        pair=new int[]{key,val};
        next=null;
    }
}
class MyHashMap {
     int m=1000;
     ArrayList<ListNode> h;
    public MyHashMap() {
        h=new ArrayList<>();
        for(int i=0;i<m;i++)
            h.add(null);
    }
    
    public void put(int key, int value) {
        int idx=key%m;
        if(h.get(idx)==null){
            h.set(idx,new ListNode(key,value));
        }
        // else if(h.pair[0]==key)
        //     h.pair[1]=value;
        else{
            ListNode curr=h.get(idx);
            ListNode prev=null;
            while(curr!=null){
                if(curr.pair[0]==key){
                    curr.pair[1]=value;
                    return;
                }
                prev=curr;
                curr=curr.next;
            }
            prev.next=new ListNode(key,value);
        }
    }
    
    public int get(int key) {
        int idx=key%m;
        if(h.get(idx)!=null){
            ListNode curr=h.get(idx);
            while(curr!=null){
                if(curr.pair[0]==key)
                    return curr.pair[1];
                curr=curr.next;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int idx=key%m;
        ListNode curr=h.get(idx);
        if(curr==null)
            return;
        else if(curr.pair[0]==key){
            h.set(idx,curr.next);
            curr.next=null;
        }
        else{
            ListNode prev=curr;
            curr=curr.next;
            while(curr!=null){
                if(curr.pair[0]==key){
                  prev.next=curr.next;
                  break;
                }
                prev=curr;
                curr=curr.next;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */