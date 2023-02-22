class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,t=0,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            t+=nums[i];
            while(t>=target){
                
                min = Math.min(min,i-l+1);
                t-=nums[l];
                l+=1;
                
            }
          
            
        }
        if(min==Integer.MAX_VALUE)
            return 0;
         return min;
    }
}