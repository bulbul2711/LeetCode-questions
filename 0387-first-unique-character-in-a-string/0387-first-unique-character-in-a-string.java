class Solution {
    public int firstUniqChar(String s) {
         int ans=Integer.MAX_VALUE;;
         for(char ch='a';ch<='z';ch++){
             int index=s.indexOf(ch);
             if(index!=-1 && index==s.lastIndexOf(ch))
                 ans=Math.min(ans,index);
         }
        return ans!=Integer.MAX_VALUE ? ans : -1;
    }
}