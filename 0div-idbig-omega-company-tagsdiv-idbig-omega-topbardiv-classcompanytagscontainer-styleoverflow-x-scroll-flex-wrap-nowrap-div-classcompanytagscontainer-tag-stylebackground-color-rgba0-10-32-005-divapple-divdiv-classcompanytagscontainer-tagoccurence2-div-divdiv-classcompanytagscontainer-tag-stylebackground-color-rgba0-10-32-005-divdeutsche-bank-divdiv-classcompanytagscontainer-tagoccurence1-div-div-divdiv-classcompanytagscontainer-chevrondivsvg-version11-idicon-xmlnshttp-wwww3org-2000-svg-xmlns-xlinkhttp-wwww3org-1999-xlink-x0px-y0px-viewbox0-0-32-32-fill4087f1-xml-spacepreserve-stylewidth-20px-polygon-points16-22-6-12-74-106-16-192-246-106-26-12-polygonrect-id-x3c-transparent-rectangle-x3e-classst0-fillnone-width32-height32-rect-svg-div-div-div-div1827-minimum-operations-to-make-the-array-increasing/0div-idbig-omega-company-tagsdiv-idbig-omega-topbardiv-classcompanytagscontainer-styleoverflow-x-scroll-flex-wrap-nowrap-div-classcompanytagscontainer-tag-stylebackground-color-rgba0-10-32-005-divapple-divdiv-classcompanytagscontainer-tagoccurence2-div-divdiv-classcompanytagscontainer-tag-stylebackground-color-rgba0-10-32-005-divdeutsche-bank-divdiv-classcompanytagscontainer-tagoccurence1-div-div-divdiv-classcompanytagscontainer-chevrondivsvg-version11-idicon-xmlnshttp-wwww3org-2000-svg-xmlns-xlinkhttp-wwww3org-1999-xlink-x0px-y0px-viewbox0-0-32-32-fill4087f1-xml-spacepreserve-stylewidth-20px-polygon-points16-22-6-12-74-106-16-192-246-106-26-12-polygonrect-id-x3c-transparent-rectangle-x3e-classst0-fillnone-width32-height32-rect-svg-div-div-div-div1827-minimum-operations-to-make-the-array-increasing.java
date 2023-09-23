class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                c+=nums[i]-nums[i+1]+1;
                nums[i+1]+=nums[i]-nums[i+1]+1;
            }
        }
        return c;
    }
}