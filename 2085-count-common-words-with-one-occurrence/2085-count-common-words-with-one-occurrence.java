class Solution {
    public int countWords(String[] a, String[] b) {
        Map<String,Integer> map1=new HashMap<>();
         Map<String,Integer> map2=new HashMap<>();
        int c=0;
        for(int i=0;i<a.length;i++)
            map1.put(a[i],map1.getOrDefault(a[i],0)+1);
        for(int i=0;i<b.length;i++)
            map2.put(b[i],map2.getOrDefault(b[i],0)+1);
        for(Map.Entry<String,Integer> entry : map1.entrySet()){
            String key=entry.getKey();
            int val=entry.getValue();
            if(val==1 && map2.containsKey(key) && map2.get(key)==1)
                c++;
        }
        return c;
    }
}