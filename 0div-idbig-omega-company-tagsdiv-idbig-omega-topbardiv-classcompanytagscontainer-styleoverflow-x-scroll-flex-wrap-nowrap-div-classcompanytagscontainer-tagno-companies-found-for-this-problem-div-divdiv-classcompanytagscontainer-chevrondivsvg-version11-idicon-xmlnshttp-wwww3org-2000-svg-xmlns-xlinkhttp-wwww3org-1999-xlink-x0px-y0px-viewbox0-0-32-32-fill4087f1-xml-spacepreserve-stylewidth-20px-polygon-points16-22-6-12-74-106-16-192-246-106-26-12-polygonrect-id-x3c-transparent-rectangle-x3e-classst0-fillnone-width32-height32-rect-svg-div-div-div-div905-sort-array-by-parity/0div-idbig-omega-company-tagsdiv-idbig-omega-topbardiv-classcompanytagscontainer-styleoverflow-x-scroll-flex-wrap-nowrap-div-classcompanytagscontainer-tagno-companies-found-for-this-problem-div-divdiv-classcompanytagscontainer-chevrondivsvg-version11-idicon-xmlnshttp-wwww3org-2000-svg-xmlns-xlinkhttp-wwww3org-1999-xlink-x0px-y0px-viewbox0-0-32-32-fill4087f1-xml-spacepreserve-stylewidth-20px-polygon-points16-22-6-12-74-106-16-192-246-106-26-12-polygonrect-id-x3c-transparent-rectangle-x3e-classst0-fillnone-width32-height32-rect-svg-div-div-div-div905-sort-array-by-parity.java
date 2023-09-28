class Solution {
    public int[] sortArrayByParity(int[] nums) {
    int l=0,r=0;
        while(l<nums.length){
            if(nums[l]%2==0){
                int t=nums[l];
                nums[l]=nums[r];
                nums[r]=t;
                r++;
            }
            l++;
        }
        return nums;
    }
}