class Solution {
    public int triangularSum(int[] nums) {
        int x=1;
        while(x!=nums.length){
            for(int i=0;i<nums.length-1;i++){
                nums[i]=(nums[i]+nums[i+1])%10;
            }
            x++;
        } 
        return nums[0];
    }
}