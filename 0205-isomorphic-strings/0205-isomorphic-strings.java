class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map1=new HashMap<>();
        Map<Character,Character> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            map1.put(ch1,ch2);
            map2.put(ch2,ch1);
        }
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(map1.get(s.charAt(i))!=ch2 || map2.get(t.charAt(i))!=ch1)
               return false;
        }
        return true;
    }
}