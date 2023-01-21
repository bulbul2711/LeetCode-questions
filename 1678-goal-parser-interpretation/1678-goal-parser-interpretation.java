class Solution {
    public String interpret(String command) {
        String s="";
        for(int i=0;i<command.length();i++)
        {
            char ch=command.charAt(i);
            if(ch=='(' && command.charAt(i+1)==')')
            { 
             ch='o';
             i++;
                s+=ch;
            }
            else if(ch=='(' && command.charAt(i+1)=='a')
            {
               //ch=Character.toString('a')+Character.toString('l');
                s+="al";
                i+=3;
            }
            else
            s+=ch;
        }
        return s;
    }
}