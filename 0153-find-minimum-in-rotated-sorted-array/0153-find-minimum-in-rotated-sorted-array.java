class Solution {
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(l<r){
            int m=l+(r-l)/2;
            if(nums[r]<nums[m])
              l=m+1;
            else
                r=m;
        }
        return nums[l];
    }
}