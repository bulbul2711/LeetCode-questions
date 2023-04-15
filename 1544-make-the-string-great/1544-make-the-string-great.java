class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty())
                st.push(ch);
            else{
                if(Math.abs(st.peek()-ch)==32)
                    st.pop();
                else
                    st.push(ch);
            }
        }
        StringBuffer sb=new StringBuffer();
        while(!st.isEmpty())
            sb.append(st.pop());
        return sb.reverse().toString();
    }
}