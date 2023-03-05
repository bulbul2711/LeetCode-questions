class Solution {
    public boolean isPalindrome(String s) {
       /* String s1=s.toLowerCase();
        char a[]=s1.toCharArray();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<a.length;i++){
            char ch=a[i];
            if(Character.isLetterOrDigit(ch))
                sb.append(ch);
        }
        if(sb.toString().equals(sb.reverse().toString()))
            return true;
        else
            return false; */
        
        String s1=s.toLowerCase();
        int i=0,j=s1.length()-1;
        while(i<j){
            
            while(i<j && !Character.isLetterOrDigit(s1.charAt(i)))
                i++;
             while(i<j && !Character.isLetterOrDigit(s1.charAt(j)))
                 j--;
            if(s1.charAt(i)!=s1.charAt(j))
                return false;
            i++;j--;
           
        }
        return true;
    }
}