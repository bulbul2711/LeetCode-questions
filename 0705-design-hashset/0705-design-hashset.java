class MyHashSet {
    int size=(int)(1e6+1);
    ArrayList<Integer>[] a;
    public MyHashSet() {
        a=new ArrayList[size];
    }
    public int hash(int key){
        return key%size;
    }
    public void add(int key) {
        int h=hash(key);
        if(a[h]==null)
            a[h]=new ArrayList<>();
        if(!a[h].contains(key))
            a[h].add(key);
    }
    public void remove(int key) {
        int h=hash(key);
        if(a[h]!=null)
            a[h].remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        int h=hash(key);
        return a[h]!=null && a[h].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */