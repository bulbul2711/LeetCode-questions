class Solution {
    public boolean isFound(int[] nums,int original){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
                return true;
            }
        }
        return false;
    }
    
    public int findFinalValue(int[] nums, int original) {
       while(isFound(nums,original))
               original*=2;
        return original;
    }
}