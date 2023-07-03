class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length())
            return false;
       // HashSet<Character> set=new HashSet<>();
        boolean flag=false;
        int[] freq=new int[26];
        List<Integer> list=new ArrayList<>();
        int a=0;
       while(a<s.length()){
           if(s.charAt(a)!=goal.charAt(a)){
               list.add(a);
           }
           freq[s.charAt(a)-'a']++;
           if(freq[s.charAt(a)-'a']>1)
               flag=true;
           a++;
       }
        if(s.equals(goal)){
           if(flag)
               return true;
        }
        else{
            if(list.size()!=2)
                return false;
            else{
                int pos1=list.get(0);
                int pos2=list.get(1);
                if(s.charAt(pos1)==goal.charAt(pos2) && s.charAt(pos2)==goal.charAt(pos1))
                    return true;
            }
        }
        return false;
    }
}