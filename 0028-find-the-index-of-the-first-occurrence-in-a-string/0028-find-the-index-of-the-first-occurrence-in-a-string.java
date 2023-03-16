class Solution {
    public int strStr(String haystack, String needle) {
      int i=0;
        int len=needle.length();
        while(i+len<=haystack.length()){
            if(haystack.substring(i,i+len).equals(needle))
                return i;
            i++;
        }
        return -1;
    }
}