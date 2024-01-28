// class Solution {
//     public int[] numberGame(int[] nums) {
//     //     Arrays.sort(nums);
    //     for(int i=0;i<nums.length-1;i+=2){
    //         int t=nums[i];
    //         nums[i]=nums[i+1];
    //         nums[i+1]=t;
    //     }
    //     return nums;
    // }
        class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int ans[]=new int[nums.length];
        for(int i:nums)
        {
            pq.offer(i);
        }
        int ind=0;
        while(pq.size()!=0)
        {
            int a=pq.poll();
            int b=pq.poll();
            ans[ind++]=b;
            ans[ind++]=a;
        }
        return ans;
    }
        

}