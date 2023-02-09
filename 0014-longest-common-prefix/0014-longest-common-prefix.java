class Solution {
    public String longestCommonPrefix(String[] strs) {
   Arrays.sort(strs);
        StringBuffer sb=new StringBuffer();
        char ch[]=strs[0].toCharArray();
        char ch1[]=strs[strs.length-1].toCharArray();
       for(int i=0;i<ch.length;i++)
       {
           if(ch[i]!=ch1[i]) break;
           sb.append(ch[i]);
       }
        return sb.toString();
    }
}