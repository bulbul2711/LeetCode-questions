class Solution {
    public List<String> buildArray(int[] target, int n) {
        // List<String> ans=new ArrayList<>();
        // List<Integer> list=new ArrayList<>();
        // Stack<Integer> st=new Stack<>();
        // for(int i=0;i<target.length;i++){
        //     list.add(target[i]);
        // }
        // for(int i=1;i<=n;i++){
        //     ans.add("Push");
        //     st.add(i);
        //     while(st.size()!=0 && !list.contains(st.peek())){
        //         st.pop();
        //         ans.add("Pop");                
        //     }
        //     if(st.size()==target.length)
        //         return ans;
        // }
        // return ans;
        
        List<String> result = new ArrayList<>();
        int current = 1; // The current number to be pushed.

        for (int i = 0; i < target.length; i++) {
            while (current < target[i]) {
                // While the current number is less than the target number,
                // push the current number and generate the "Push" operation.
                result.add("Push");
                result.add("Pop"); // After pushing, immediately pop.
                current++;
            }

            // The current number matches the target number, so push it.
            result.add("Push");

            current++; // Move to the next number to be pushed.
        }

        return result;
    }
}