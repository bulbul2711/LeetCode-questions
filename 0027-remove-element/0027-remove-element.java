class Solution {
    public int removeElement(int[] nums, int val) {
     int l=0,r=0;
        while(l<nums.length){
            if(nums[l]!=val){
                int t=nums[l];
                nums[l]=nums[r];
                nums[r]=t;
                r++;
            }
            l++;
        }
        return r;
      }
  }