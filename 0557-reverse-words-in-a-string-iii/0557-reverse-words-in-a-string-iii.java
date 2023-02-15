class Solution {
    public String reverseWords(String s) {
        
//          String arr[]=s.split(" ");
//          String res="";
//          for(int i=0;i<arr.length;i++)
//          {
//              String str=arr[i];
//          for(int j=str.length()-1;j>=0;j--)
//              res+=str.charAt(j);
//              res+=" ";

//          }
//          return res.trim();
        int start=0;
        char[] a=s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]==' '){
             reverse(start,i-1,a);
                start=i+1;
            }
            else if(i==a.length-1)
              reverse(start,i,a);
        }
        String s1=new String(a);
        return s1;
     }
    void reverse(int start,int end,char[] arr)
    {
        while(start<end)
        {
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
