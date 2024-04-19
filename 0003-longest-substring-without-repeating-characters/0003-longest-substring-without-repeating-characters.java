class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int l=0,res=0;
        // List<Character> list=new ArrayList<>();
        // for(int r=0;r<s.length();r++){
        //     char ch=s.charAt(r);
        //     while(list.contains(ch)){
        //         list.remove(s.charAt(l));
        //         l++;
        //     }
        //     list.add(ch);
        //     res=Math.max(res,r-l+1);
        // }
        // return res;
         if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}