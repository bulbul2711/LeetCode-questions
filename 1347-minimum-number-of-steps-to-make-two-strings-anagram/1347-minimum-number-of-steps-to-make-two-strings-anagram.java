class Solution {
    public int minSteps(String s, String t) {
        int sum=0;
       HashMap<Character,Integer> map=new HashMap<>();
       // HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++)
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map.containsKey(ch) && map.get(ch)!=0)
                map.put(ch,map.get(ch)-1);
        }
         for(Map.Entry<Character,Integer> entry:map.entrySet()){
             sum+=entry.getValue();
         }
        return sum;
    }
}