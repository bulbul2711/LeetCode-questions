class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[2];
        Arrays.fill(ans,-1);
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                    low=mid+1;
                    ans[1]=mid;
            }
                
            else if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        low=0;
        high=nums.length-1;
         while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                    high=mid-1;
                    ans[0]=mid;
            }
                
            else if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return ans;
    }
}