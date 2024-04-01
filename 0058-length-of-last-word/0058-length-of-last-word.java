class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int a=str.lastIndexOf(' ');
        return str.substring(a+1).length();
    }
}