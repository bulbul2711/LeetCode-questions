class Solution {
    public int wiggleMaxLength(int[] nums) {
        int x=2;
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1] && x!=1){
                c++;
                x=1;
            }
            else if(nums[i]>nums[i-1] && x!=0){
                c++;
                x=0;
            }
        }
        return c;
    }
}