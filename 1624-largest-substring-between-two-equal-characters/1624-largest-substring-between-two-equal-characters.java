class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            int b=s.lastIndexOf(s.charAt(i));
            max=Math.max(max,b-i-1);
        }
        return max;
    }
}