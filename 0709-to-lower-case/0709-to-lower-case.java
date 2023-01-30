class Solution {
    public String toLowerCase(String s) {
        
//strings are immutable so reassigning it baar baar can cause much garbage collection,so it is time consuming.
        // String str="";
        // for(int i=0;i<s.length();i++)
        // {
        //     char ch=s.charAt(i);
        //     if(ch>='A' && ch<='Z')
        //         ch+=32;
        //     str+=ch;
        // }
        // return str;
        
        
        //using string builder
        StringBuilder sb=new StringBuilder();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='A' && ch[i]<='Z')
                ch[i]+=32;
            sb.append(ch[i]);
        }
        return sb.toString();
    }
}