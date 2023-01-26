class Solution {
    public String truncateSentence(String s, int k) {
        String str="";
        String arr[]=s.split(" ");
        for(int i=0;i<k;i++)
        {
            str+=arr[i]+" ";
       // str+=" ";
    }
        return str.trim();
        
    }
}