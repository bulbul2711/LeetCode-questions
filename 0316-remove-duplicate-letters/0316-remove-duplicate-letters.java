class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        st.push(s.charAt(0));
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.contains(ch)){
               while(!st.isEmpty() && st.peek()>ch && map.get(st.peek())>i){
                    st.pop();
                    }
            st.push(ch);
            }
        }
        StringBuffer sb=new StringBuffer();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}