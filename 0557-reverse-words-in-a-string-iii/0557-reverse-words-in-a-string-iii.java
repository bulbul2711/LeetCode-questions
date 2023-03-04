class Solution {
    public String reverseWords(String s) {
        
//          String arr[]=s.split(" ");
//          String res="";
//          for(int i=0;i<arr.length;i++)
//          {
//              String str=arr[i];
//            for(int j=str.length()-1;j>=0;j--)
//              res+=str.charAt(j);
//              res+=" ";

//          }
//          return res.trim();
        
        
       String arr[]=s.split(" ");
       
        StringBuffer sb1=new StringBuffer();
        for(int i=0;i<arr.length;i++){
             StringBuffer sb=new StringBuffer(arr[i]);
            sb1.append(sb.reverse());
            sb1.append(" ");
        }
        return sb1.toString().trim();
    }
}
