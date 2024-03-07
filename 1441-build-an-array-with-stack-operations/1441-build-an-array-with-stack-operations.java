class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<target.length;i++){
            list.add(target[i]);
        }
      
        for(int i=1;i<=n;i++){
            ans.add("Push");
            st.add(i);
            while(st.size()!=0 && !list.contains(st.peek())){
                st.pop();
                ans.add("Pop");                
            }
            if(st.size()==target.length)
                return ans;
        }
        return ans;
    }
}