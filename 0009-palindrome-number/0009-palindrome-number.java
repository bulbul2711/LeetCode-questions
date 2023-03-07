class Solution {
    public boolean isPalindrome(int x) {
       /* String s=Integer.toString(x);
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;*/
        
        String s=Integer.toString(x);
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return false;
        }
            return true;
    }
}