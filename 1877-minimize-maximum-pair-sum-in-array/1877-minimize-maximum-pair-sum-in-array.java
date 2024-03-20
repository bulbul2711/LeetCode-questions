class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int l=0,r=nums.length-1;
        int max=Integer.MIN_VALUE;
        while(l<r){
            max=Math.max(max,nums[l++]+nums[r--]);
        }
        return max;
    }
}