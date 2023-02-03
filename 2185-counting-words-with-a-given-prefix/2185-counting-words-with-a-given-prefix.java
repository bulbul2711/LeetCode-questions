class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for(int i=0;i<words.length;i++)
        {
            String s=words[i];
            if(s.length()>=pref.length())
            if(s.substring(0,pref.length()).equals(pref))
                c++;
                
        }
         return c;   
    }
}