class MyHashSet {
    int a[]=new int[(int)Math.pow(10,6)+1];
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        if(a[key]==1)
            return;
        else
            a[key]=1;
    }
    public void remove(int key) {
        if(a[key]==1)
            a[key]=0;
    }
    
    public boolean contains(int key) {
        if(a[key]==1)
            return true;
    return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */