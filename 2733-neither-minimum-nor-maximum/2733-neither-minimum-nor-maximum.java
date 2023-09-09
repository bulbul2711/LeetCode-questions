class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max=nums[0],min=nums[0];
        for(int i=1;i<nums.length;i++){
           min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
        }
         for(int i=0;i<nums.length;i++){
             if(nums[i]!=min && nums[i]!=max)
                 return nums[i];
         }
        return -1;
    }
}