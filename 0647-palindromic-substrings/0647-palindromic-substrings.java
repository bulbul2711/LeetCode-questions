class Solution {
    int count;
    public int countSubstrings(String s) {
        for(int i=0;i<s.length();i++){
            isvalid(s,i,i);
            isvalid(s,i,i+1);
        }
        return count;
    }
    void isvalid(String s, int l, int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            count++;
            l--;
            r++;
        }
    }
}