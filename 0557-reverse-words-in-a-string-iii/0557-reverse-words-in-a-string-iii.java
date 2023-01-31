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
        
        
        //USING STRING BUFFER
//         StringBuffer sb=new StringBuffer();
//          StringBuffer sb1=new StringBuffer();
//         for(int i=0;i<s.length();i++)
//             sb.append(s.charAt(i));
        
//          for(int i=0;i<sb.length();i++)
//          {
//              if(sb.charAt(i)==' ')
//                  sb.reverse(sb.substring())
//          }
//         return sb.toString();
     }
}