class Solution {
    public void moveZeroes(int[] nums) {
        int l=0,r=0;
        while(l<nums.length){
            if(nums[l]!=0){
                int t=nums[l];
                nums[l]=nums[r];
                nums[r]=t;
                r++;
            }
            l++;
        }
    }
}