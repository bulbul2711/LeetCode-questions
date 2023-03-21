class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=t.length()-1,j=s.length()-1;
        while(i>=0 && j>=0){
            if(t.charAt(i)!=s.charAt(j))
                i--;
            else{
                i--;
                j--;
            }
        }
        return j==-1;
           
    }
}