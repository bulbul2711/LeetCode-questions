class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            if(nums[Math.abs(x)-1]<0)
                return Math.abs(x);
            else
            nums[Math.abs(x)-1]=nums[Math.abs(x)-1]*-1;
        }
        return 0;
    }
}