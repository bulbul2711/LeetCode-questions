class Solution {
    public int removeElement(int[] nums, int val) {
       int l=0,r=nums.length-1;
//         if(nums.length==1 && nums[0]!=val){
            
//         }
        while(l<=r){
            if(nums[l]==val){
               int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                r--;
            }
            else
                l++;
        }
          
          
            return l;
    }
}