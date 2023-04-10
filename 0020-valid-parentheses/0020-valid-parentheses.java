class Solution {
    public boolean isValid(String s) {
      ArrayList<Character> al=new ArrayList<>();
        int c=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='[' || ch=='{' || ch=='('){
                al.add(ch);
                c++;
            }
            else if(!al.isEmpty() && matching(al.get(c),ch)){
                al.remove(c);
                c--;
            }
            else
                return false;
        }
        return (al.isEmpty());
       
    }
    boolean matching(char a,char b){
        if((a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}'))
            return true;
        else
            return false;
    }
}