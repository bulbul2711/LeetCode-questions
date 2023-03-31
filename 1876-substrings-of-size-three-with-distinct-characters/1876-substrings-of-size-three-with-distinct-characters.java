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
        
        int c=0;
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i-1)!=s.charAt(i) && 
               s.charAt(i)!=s.charAt(i+1) &&  
               s.charAt(i-1)!=s.charAt(i+1))
                c++;
        }
        return c;
    }
}