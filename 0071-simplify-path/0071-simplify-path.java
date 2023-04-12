class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        for(String i:path.split("/")){
            if(i.equals("..") && !st.isEmpty()){
                st.pop();
            }
            else if(!i.equals("..") &&
                    !i.equals(".") &&
                    !i.equals(""))
                st.push(i);
        }
        return "/"+String.join("/",st);
    }
}