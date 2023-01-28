class Solution {
    public int maxProductDifference(int[] nums) {
      //  int max=Integer.MIN_VALUE;
       Arrays.sort(nums);
        // for(int i=nums.length()-1;i>=0;i--)
        // {
        //     int pd = (nums[i]*nums[i-1] - nums[]*nums[]);
        // }
        return Math.abs(nums[0]*nums[1] - nums[nums.length-1]*nums[nums.length-2]);
    }
}