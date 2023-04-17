class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        //Monotonic Stack
        Stack<Integer> temp=new Stack<>();
       // int[] res=new int[nums1.length];
        temp.push(nums2[0]);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<nums2.length;i++){
            while(!temp.isEmpty() && temp.peek()<nums2[i]){
                map.put(temp.pop(),nums2[i]);
            }
            temp.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i]))
                nums1[i]=map.get(nums1[i]);
            else
                nums1[i]=-1;
        }
        return nums1;
    }
}