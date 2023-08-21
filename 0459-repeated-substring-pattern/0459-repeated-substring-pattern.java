class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String newstr=s.substring(1)+s.substring(0,s.length()-1);
        return newstr.contains(s);
    }
}