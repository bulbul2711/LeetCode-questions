class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.lastIndexOf(ch)-s.indexOf(ch)-1!=distance[ch-'a'])
                return false;
        }
        return true;
    }
}