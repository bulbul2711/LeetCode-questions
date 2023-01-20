class Solution {
    public int[] runningSum(int[] nums) {
        int res[]=new int[nums.length];
        res[0]=nums[0];   
        int cursum=nums[0];
            for(int i=1;i<nums.length;i++)
        {
                cursum+=nums[i];
            res[i]=cursum;
        }
        return res;
    }
}