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
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}