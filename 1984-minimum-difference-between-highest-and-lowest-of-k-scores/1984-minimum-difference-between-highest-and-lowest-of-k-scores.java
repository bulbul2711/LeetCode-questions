class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        k-=1;
        int i=0;
        int min=Integer.MAX_VALUE;
        while(k<nums.length){
            min=Math.min(min,nums[k]-nums[i]);
            i++;
            k++;
        }
        return min;
    }
}