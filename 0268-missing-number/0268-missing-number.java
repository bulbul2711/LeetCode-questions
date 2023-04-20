class Solution {
    public int missingNumber(int[] nums) {
        
    //Math solution
      /*  int sum=0;
        int actual_sum = (nums.length*(nums.length+1))/2;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return actual_sum-sum;*/
        
        for(int i=0;i<nums.length;i++){
            while(nums[i]<nums.length && i!=nums[i]){
                int temp=nums[nums[i]];
                nums[nums[i]]=nums[i];
                nums[i]=temp;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i])
                return i;
        }
        return nums.length;
    }
}