class Solution {
    public int differenceOfSum(int[] nums) {
        int elesum=0,digsum=0;
        for(int i=0;i<nums.length;i++)
        {
            elesum+=nums[i];
            while(nums[i]>0)
            {
                digsum+=nums[i]%10;
                nums[i]/=10;
            }
        }
        return Math.abs(elesum-digsum);
    }
}