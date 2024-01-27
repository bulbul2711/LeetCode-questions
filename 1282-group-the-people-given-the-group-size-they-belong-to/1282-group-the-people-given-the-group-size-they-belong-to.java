class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res=new ArrayList<>();
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<groupSizes.length;i++){
            int x=groupSizes[i];
            if(!map.containsKey(x))
                map.put(x,new ArrayList<Integer>());
            List<Integer> list=map.get(x);
            list.add(i);
            if(list.size()==x){
                res.add(list);
                map.remove(x);
            }
        }
        return res;
    }
}