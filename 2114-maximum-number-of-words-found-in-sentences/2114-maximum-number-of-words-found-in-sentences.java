class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
       // String[] arr=sentences.split("\\,");
        for(int i=0;i<sentences.length;i++)
        {   int c=0;
            String s=sentences[i];
            s=s+" ";
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)==' ')
                    c++;
            }
            max=Math.max(max,c);
        }
        return max;
    }
}