class Solution {
    public int countPrefixes(String[] words, String s) {
      Map<String,Integer> map=new HashMap<>();
        int c=0;
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        for(int i=1;i<=s.length();i++){
            if(map.containsKey(s.substring(0,i)))
                c+=map.get(s.substring(0,i));
        }
        return c;
    }
}
