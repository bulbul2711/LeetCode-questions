class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        for(int i=0;i<stones.length();i++)
        {
            for(int j=0;j<jewels.length();j++)
        {
            char ch=stones.charAt(i);
                char ch1=jewels.charAt(j);
           if(ch==ch1)
               c++;
        }
           
    }
         return c;
}
}