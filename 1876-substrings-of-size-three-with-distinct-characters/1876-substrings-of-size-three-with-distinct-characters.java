class Solution {
    public int countGoodSubstrings(String s) {
      /*  int j=3;int c=0;
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length()-2;i++){
            String str=s.substring(i,j);
            for(int k=0;k<3;k++){
                hs.add(str.charAt(k));
            }
            if(hs.size()==str.length()){
                c++;
            }
            j++;
            hs.clear();
        }
        return c;*/
        
        int j=3,c=0;
        for(int i=0;i<s.length()-2;i++){
            String str=s.substring(i,j);
            if((str.charAt(0)!=str.charAt(1)) && (str.charAt(1)!=str.charAt(2)) &&  (str.charAt(0)!=str.charAt(2)))
                c++;
            j++;
        }
        return c;
    }
}