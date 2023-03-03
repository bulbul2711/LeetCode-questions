class Solution {
    public int strStr(String haystack, String needle) {
        int len=needle.length();
        int i=0,j=len;
        while(j+i<=haystack.length()){
            String str=haystack.substring(i,j+i);
            if(str.equals(needle))
                return i;
                i=i+1;
                
        }
        return -1;
    }
}