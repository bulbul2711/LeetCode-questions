class Solution {
    public String mergeAlternately(String word1, String word2) {
      /*  StringBuffer sb=new StringBuffer();
        int l1=word1.length();
        int l2=word2.length();
        int min=l1<l2?l1:l2;
        int l=0,r=0;
        while(min>l){
            sb.append(word1.charAt(l));
            sb.append(word2.charAt(l));
           
           l++;
        }
        
        if(l1>l2){
            sb.append(word1.substring(min));
        }
        else
            sb.append(word2.substring(min));
        
        return sb.toString();*/
        
        //USING TWO POINTERS
        int l1=word1.length();
        int l2=word2.length();
        int i=0,j=0;
        StringBuffer sb =new StringBuffer();
        while(i<l1 || j<l2){
            if(i<l1)
                sb.append(word1.charAt(i++));
            if(j<l2)
                sb.append(word2.charAt(j++));
        }
        return sb.toString();
    }
}