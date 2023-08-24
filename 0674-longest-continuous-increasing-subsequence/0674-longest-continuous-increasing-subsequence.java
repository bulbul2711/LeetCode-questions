class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int l=0,r=0,max=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[r]<nums[r+1]){
                r++;
                max=Math.max(max,r-l+1);
            }
            else{
                l=r+1;
                r=l;
            }
        }
        return max;
    }
}