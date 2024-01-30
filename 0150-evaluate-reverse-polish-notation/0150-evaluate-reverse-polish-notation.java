class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> st=new ArrayDeque<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                st.push(func(tokens[i],st.pop(),st.pop()));
            }
            else
                st.push(Integer.parseInt(tokens[i]));
        }
        return st.pop();
    }
    int func(String op, int a, int b){
        if(op.equals("+"))
            return b+a;
        if(op.equals("-"))
            return b-a;
        if(op.equals("*"))
            return b*a;
        if(op.equals("/"))
            return b/a;
        return 0;
    }
}