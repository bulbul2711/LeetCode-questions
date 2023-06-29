class Solution {
    public int findPeakElement(int[] nums) {
        int l=0,r=nums.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]<nums[mid+1])
                l=mid+1;
            else
                r=mid;
        }
        return l;
        
        //USING BINARY SEARCH
        
        // int low=0,high=nums.length-1;
        // while(low<=high){
        //     int mid=low+(high-low)/2;
        //     if((mid==0 || nums[mid-1]<nums[mid]) && (mid==nums.length-1 || nums[mid+1]<nums[mid]))
        //        return mid;
        //        else if(mid>0 && nums[mid-1]>nums[mid])
        //        high=mid-1;
        //        else
        //        low=mid+1;
        // }
        // return -1;
    }
}