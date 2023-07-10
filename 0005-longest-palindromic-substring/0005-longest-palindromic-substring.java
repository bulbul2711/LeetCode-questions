class Solution {
    String res=""; int len=0;
    public String longestPalindrome(String s) {
        
        for(int i=0;i<s.length();i++){
            isvalid(s,i,i);
            isvalid(s,i,i+1);
        }
        return res;
    }
    void isvalid(String s, int l, int r){
       
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            if((r-l+1)>len){
                len=r-l+1;
                res=s.substring(l,r+1);
            }
            l--;
            r++;
        }
       
    }
}