class Solution {
    public int minSteps(String s, String t) {
         int sum=0;
       // HashMap<Character,Integer> map=new HashMap<>();
       //  for(int i=0;i<s.length();i++)
       //      map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
       //  for(int i=0;i<t.length();i++){
       //      char ch=t.charAt(i);
       //      if(map.containsKey(ch) && map.get(ch)!=0)
       //          map.put(ch,map.get(ch)-1);
       //  }
       //   for(Map.Entry<Character,Integer> entry:map.entrySet()){
       //       sum+=entry.getValue();
       //   }
       //  return sum;
        
        int[] a=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            a[ch-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(a[ch-'a']!=0)
                a[ch-'a']--;
        }
        for(int i=0;i<26;i++)
            sum+=a[i];
        return sum;
    }
}