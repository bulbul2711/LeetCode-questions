class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.toLowerCase();
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
            return false;
    }
}