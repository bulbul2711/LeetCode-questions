class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
      //  Set<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        // for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        //     hs.add(entry.getValue());
        
    HashSet<Integer> hs=new HashSet<>(map.values());
        return map.size()==hs.size();
    }
}