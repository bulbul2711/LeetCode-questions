class Solution {
    public boolean isValid(String s) {
     /* ArrayList<Character> al=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='[' || ch=='{' || ch=='(')
                al.add(ch);
            else if(!al.isEmpty() && matching(al.get(al.size()-1),ch))
                al.remove(al.size()-1);
             else
                return false;
        }
        return (al.isEmpty());
       
    }
    boolean matching(char a,char b){
        if((a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}'))
            return true;
        else
            return false;*/
        
         ArrayList<Character> al=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='[' || ch=='{' || ch=='(')
                al.add(ch);
            else if(al.isEmpty())
                return false;
            else if(ch==')' && al.get(al.size()-1)=='(')
                 al.remove(al.size()-1);
            else if(ch=='}' && al.get(al.size()-1)=='{')
                 al.remove(al.size()-1);
            else if(ch==']' && al.get(al.size()-1)=='[')
                 al.remove(al.size()-1);
            else 
                return false;
            
        }
        return (al.isEmpty());
    }
}