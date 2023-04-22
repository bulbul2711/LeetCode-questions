class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        ArrayDeque<Integer> st=new ArrayDeque<>();int c=0;
        int res[]=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                c=st.pop();
                res[c]=i-c;
            }
            st.push(i);
        }
        return res;
    }
}