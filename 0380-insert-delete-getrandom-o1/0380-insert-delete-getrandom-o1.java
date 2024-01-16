class RandomizedSet {
    ArrayList<Integer> list;
    Map<Integer,Integer> map;
    Random r;
    public RandomizedSet() {
        list=new ArrayList<>();
        map=new HashMap<>();
        r=new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val))
            return false;
        map.put(val,list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val))
            return false;
        int i=map.get(val);
        int lastI=list.size()-1;
        if(i!=lastI){
            int last=list.get(lastI);
            list.set(i,last);
            map.put(last,i);
        }
        list.remove(lastI);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        return list.get(r.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */