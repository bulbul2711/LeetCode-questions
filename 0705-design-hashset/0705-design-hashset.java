class MyHashSet {
    int size=1000;
    ArrayList<Integer>[] a;        //array of arraylist
    public MyHashSet() {
        a=new ArrayList[size];
    }
    public void add(int key) {
        int h=key%size;
        if(a[h]==null)                   //default value of arraylist is null
            a[h]=new ArrayList<>();
        if(!a[h].contains(key))
            a[h].add(key);
    }
    public void remove(int key) {
        int h=key%size;
        if(a[h]!=null)
            a[h].remove(Integer.valueOf(key));   //remove function will not throw error if the value to be removed is not in the list
    }
    
    public boolean contains(int key) {
        int h=key%size;
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