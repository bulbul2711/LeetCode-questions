class Solution {
    public String makeSmallestPalindrome(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++)
            sb.append(Character.toString(Math.min(s.charAt(i), s.charAt(n - i - 1))));
        return sb.toString();
    }
}