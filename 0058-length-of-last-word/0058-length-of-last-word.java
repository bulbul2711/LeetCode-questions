class Solution {
    public int lengthOfLastWord(String s) {
        if(s.indexOf(' ')==-1)
            return s.length();
        int i=s.length()-1;
        while(s.charAt(i)==' '){
            i--;
        }
     
        int j=i;
        while(j>=0 && s.charAt(j)!=' '){
            j--;
        }
        // if(j==-1)
        //     return i-j+1;
        return i-j;
    }
}