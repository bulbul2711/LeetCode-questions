class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i+=2){
            int t=nums[i-1];
            nums[i-1]=nums[i];
            nums[i]=t;
        }
        return nums;
    }
}