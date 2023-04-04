class Solution {
    public int partitionString(String s) {
        int c=0;
       HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!hs.contains(s.charAt(i)))
               hs.add(s.charAt(i));
            else{
                c++;
                hs.clear();
                hs.add(s.charAt(i));
            }
        }
        return c+1;
    }
}