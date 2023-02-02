class Solution {
    public String firstPalindrome(String[] words) {
        String s1 ="";
        for(int i=0;i<words.length;i++)
            if(palindrome(words[i]))
            {
                s1= words[i];
                break;
            }
        
            return s1;
    }
    
    boolean palindrome(String s)
    {
       /* StringBuffer sb=new  StringBuffer();
        for(int i=s.length()-1;i>=0;i--)
            sb.append(s.charAt(i));
        if(s.equals(sb.toString()))
            return true;
        else 
            return false;*/
        String newstr ="";
         for(int i=s.length()-1;i>=0;i--)
             newstr+=s.charAt(i);
        if(s.equals(newstr))
            return true;
        else return false;
    }
}