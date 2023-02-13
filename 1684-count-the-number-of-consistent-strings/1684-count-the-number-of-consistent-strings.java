class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
        HashSet<Character> hs = new  HashSet<>();
        for(int i=0;i<allowed.length();i++)
            hs.add(allowed.charAt(i));
        
        for(int i=0;i<words.length;i++)
        {
            String str=words[i];
            boolean flag=true;
            for(int j=0;j<str.length();j++)
            {
                if(!hs.contains(str.charAt(j)))
                {
                   flag=false;break;
                }
             }
            if(flag) c++;
        }
       return c;
}
}