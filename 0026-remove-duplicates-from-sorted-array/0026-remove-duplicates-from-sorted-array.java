class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0,r=1;
        while(l<nums.length-1){
            if(nums[l]!=nums[l+1]){
                nums[r]=nums[l+1];
                r++;
            }
            l++;
        }
        return r;
    }
}