class Solution {
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1;
        while(l<r){
            int m=l+(r-l)/2;
            while(nums[r]==nums[m] && m!=r)
                r--;
            if(nums[r]<nums[m])
                l=m+1;
            else
                r=m;
        }
        return nums[l];
    }
}