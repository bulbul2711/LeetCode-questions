class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2){
            int t=nums[i+1];
            nums[i+1]=nums[i];
            nums[i]=t;
        }
        return nums;
    }
}