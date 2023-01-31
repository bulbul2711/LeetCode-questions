class Solution {
    public String reverseWords(String s) {
        
        String arr[]=s.split(" ");
        String res="";
        for(int i=0;i<arr.length;i++)
        {
            String str=arr[i];
        for(int j=str.length()-1;j>=0;j--)
            res+=str.charAt(j);
            res+=" ";

        }
        return res.trim();
    }
}