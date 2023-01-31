class Solution {
    public int uniqueMorseRepresentations(String[] words) {
       String a[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String res[]=new String[words.length];
        
        for(int i=0;i<words.length;i++)
        {
             String s="";
            for(int j=0;j<words[i].length();j++)
            {
             s+=a[words[i].charAt(j) - 'a'];
           
            }
             res[i]=s;
        }
        
      HashSet<String> hs = new HashSet<>();
         for(int i=0;i<res.length;i++)
         { 
              if(hs.contains(res[i])==false)
             hs.add(res[i]);
         }
        return hs.size();
}
}