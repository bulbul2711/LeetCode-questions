class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i=0,j=0;
        Stack<Integer> st=new Stack<>();
        while(i<pushed.length){
                st.push(pushed[i]);
                i++;
               while(!st.isEmpty() && st.peek()==popped[j]){
                st.pop();
                j++;
               }
        }
       return st.isEmpty();
    }
}