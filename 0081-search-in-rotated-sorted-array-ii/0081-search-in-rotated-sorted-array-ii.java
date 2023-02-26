class Solution {
    public boolean search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            while(nums[low]==nums[mid] && low!=mid)
                low+=1;
            if(nums[mid]==target)
                return true;
            else if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<nums[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }
            else{
                if(nums[mid]<target && target<=nums[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return false;
    }
}