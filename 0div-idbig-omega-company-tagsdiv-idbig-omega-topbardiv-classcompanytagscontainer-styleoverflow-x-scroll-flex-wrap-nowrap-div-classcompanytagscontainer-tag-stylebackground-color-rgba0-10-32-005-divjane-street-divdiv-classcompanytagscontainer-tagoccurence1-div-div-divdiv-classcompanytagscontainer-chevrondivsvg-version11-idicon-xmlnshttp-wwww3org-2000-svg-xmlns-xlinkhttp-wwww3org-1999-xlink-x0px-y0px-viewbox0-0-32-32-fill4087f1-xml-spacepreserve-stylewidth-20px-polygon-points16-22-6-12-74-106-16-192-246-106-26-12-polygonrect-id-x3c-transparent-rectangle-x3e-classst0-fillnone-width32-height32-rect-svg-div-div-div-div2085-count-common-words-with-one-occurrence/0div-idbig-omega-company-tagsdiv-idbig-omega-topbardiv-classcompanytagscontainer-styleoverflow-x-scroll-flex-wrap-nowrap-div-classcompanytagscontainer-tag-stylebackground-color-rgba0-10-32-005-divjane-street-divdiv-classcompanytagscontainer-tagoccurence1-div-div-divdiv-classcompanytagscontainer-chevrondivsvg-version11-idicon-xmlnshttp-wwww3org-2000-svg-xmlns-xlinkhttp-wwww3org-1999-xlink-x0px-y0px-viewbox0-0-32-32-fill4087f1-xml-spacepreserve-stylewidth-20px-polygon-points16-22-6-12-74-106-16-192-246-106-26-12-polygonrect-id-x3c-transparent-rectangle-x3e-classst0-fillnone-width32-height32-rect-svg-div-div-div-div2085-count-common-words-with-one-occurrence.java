class Solution {
    public int countWords(String[] a, String[] b) {
        Map<String,Integer> map1=new HashMap<>();
      //   Map<String,Integer> map2=new HashMap<>();
        int c=0;
        for(int i=0;i<a.length;i++)
            map1.put(a[i],map1.getOrDefault(a[i],0)+1);
        // for(int i=0;i<b.length;i++)
        //     map2.put(b[i],map2.getOrDefault(b[i],0)+1);
        for(String x:b){
            if(map1.containsKey(x) && map1.get(x)<=1)
                map1.put(x,map1.get(x)-1);
        }
        for(int i:map1.values()){
            if(i==0)
                c++;
        }
        return c;
    }
}