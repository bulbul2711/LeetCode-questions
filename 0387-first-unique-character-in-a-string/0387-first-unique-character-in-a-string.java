class Solution {
    public int firstUniqChar(String s) {
        // int[] a=new int[26];
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     a[ch-'a']++;
        // }
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(a[ch-'a']==1)
        //         return i;
        // }
        // return -1;
        
         for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
             if(s.indexOf(ch)==s.lastIndexOf(ch))
                 return i;
         }
        return -1;
    }
}