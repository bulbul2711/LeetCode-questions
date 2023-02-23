class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int x= Math.abs(nums[i]);
            if(nums[x-1]<0)
                return Math.abs(x);
            else
            nums[x-1]=nums[x-1]*-1;
        }
        return 0;
    }
}