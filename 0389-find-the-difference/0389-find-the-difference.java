class Solution {
    public char findTheDifference(String s, String t) {
        int c1=0,c2=0;
        for(int i=0;i<s.length();i++){
            c1+=(int)s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            c2+=(int)t.charAt(i);
        }
        return (char)(c2-c1);
    }
}