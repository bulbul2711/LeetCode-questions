class Solution {
    public int[] nextGreaterElements(int[] nums) {
      /*  int temp1[]=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            temp1[i]=nums[i];
            temp1[i+nums.length]=nums[i];
        }
         Stack<Integer> temp=new Stack<>();
        temp.push(nums[0]);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<temp1.length;i++){
            while(!temp.isEmpty() && temp.peek()<temp1[i]){
                map.put(temp.pop(),temp1[i]);
            }
            temp.push(temp1[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
                nums[i]=map.get(nums[i]);
            else
                nums[i]=-1;
        }
        return nums;*/
        
        int res[]=new int[nums.length];
        Arrays.fill(res,-1);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                res[st.pop()]=nums[i];
            }
             st.push(i);
        }
         for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                res[st.pop()]=nums[i];
            }
        }
        return res;
    }
}