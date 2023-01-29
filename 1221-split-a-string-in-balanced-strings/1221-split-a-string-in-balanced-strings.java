class Solution {
    public int balancedStringSplit(String s) {
        String str="";int x=0;
        for(int i=0;i<s.length();i++)
        {
            //for(int j=i+1;j<s.length();j++)
            str+=s.charAt(i);
            if(count(str))
            {
                x++;
                str="";
        }
    }
        return x;
}
    
    boolean count(String s1)
    {
        int r=0,l=0;
       for(int i=0;i<s1.length();i++)
        {  
           char ch=s1.charAt(i);
           if(ch=='L')
               l++;
           else
               r++;
       }
        if(r==l)
            return true;
        else 
            return false;
    }
}