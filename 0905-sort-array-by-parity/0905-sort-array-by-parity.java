class Solution {
    public int[] sortArrayByParity(int[] nums) {
       int l=0,r=0;
        while(l<nums.length){
            if(nums[l]%2==0){
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                r++;
                }
            
                l++;     
        }
        return nums;
}
}