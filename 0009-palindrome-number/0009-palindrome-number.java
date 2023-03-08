class Solution {
    public boolean isPalindrome(int x) {
      /*  String s=Integer.toString(x);
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;*/
        
            if(x<0)
            return false;
        int r=0,temp=x;
            while(temp>0){
               int d=temp%10;
               r=r*10+d;
                temp/=10;
            }
        if(r==x)
            return true;
        else
            return false;
    }
}